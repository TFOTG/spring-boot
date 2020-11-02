package com.peng.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author peng.wang
 * @Description 数组
 * @createTime 2020/7/6
 */
public class ArraySolution {


    /**
     * 448 寻找消失的数字
     *
     * 解题思路，用数组下标来映射消失的数字
     * 遍历数组，把每一个出现过的数字的下表数字改成负数
     * 再次遍历数组，大于0的下表就是未出现过的数字
     * 注意：数组是从0开始，数字是从1开始
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int count = 0; count < nums.length; count++) {
            int pos = Math.abs(nums[count]);
            nums[pos - 1] = Math.abs(nums[pos - 1]) * -1;
            System.out.println(count+":"+JSON.toJSONString(nums));
        }
        for (int count = 0; count < nums.length; count++) {
            if (nums[count] > 0) {
                result.add(count+1);
            }
        }
        return result;
    }

    /**
     * 只出现一次的数字
     *
     * leetcode 136
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {

        int result=nums[0];
        for (int i=1 ;i<nums.length; i++) {
            result=result^nums[i];
        }
        return result;
    }

    /**
     * 31.下一个排列
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while (i>=0&&nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while (j>=0&&nums[j]<=nums[i]) {
                j--;
            }
            change(nums,i,j);
        }
        reverse(nums,i+1);

    }

    public void change(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public void reverse(int[] nums, int start) {
        int end=nums.length-1;
        while(start<end){
            change(nums,start,end);
            start++;
            end--;
        }
    }

    /**
     * 48.图像翻转
     *
     * 分层指环，每一层置换n-1个
     * 双层循环，第一层循环层数，第二层循环该行的具体列
     * 行列坐标规律，行列交换，列行相加=数组长度
     * @param matrix
     */
    public void rotate(int[][] matrix) {
       int length=matrix.length;
       for(int i=0;i<length/2;i++){
           for(int j=i;j<length-1-i;j++){
               int temp=matrix[i][j];
                matrix[i][j]=matrix[length-1-j][i];
                matrix[length-1-j][i]=matrix[length-1-i][length-1-j];
                matrix[length-1-i][length-1-j]=matrix[j][length-1-i];
               matrix[j][length-1-i]=temp;
           }
       }
    }

    /**
     * 581
     *
     * 解题思路双指针
     * 从前往后遍历，找最大值，记录此最大值前的逆序的位置
     * 从后往前遍历，找最小值，记录此最小值后的逆序的位置
     *
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int left = 0, right = -1;
        int max = nums[0], min = nums[length - 1];
        for (int i = 0; i < length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            } else {
                right = i;
            }
            if (nums[length - i - 1] <= min) {
                min = nums[length - i - 1];
            } else {
                left = length - i - 1;
            }
        }
        return right - left + 1;
    }

    /**
     * 55 跳跃游戏
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {

        int length=nums.length;
        int maxDistance=0;

        if (nums==null||length==0){
            return false;
        }

        for(int i=0;i<length;i++){
            if(i<=maxDistance){
                maxDistance=Math.max(maxDistance,i+nums[i]);
                if(maxDistance>=length-1){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 56.合并区间
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {

        if(intervals.length<2){
            return intervals;
        }
        int length=intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> list=new ArrayList<>();

        //遍历到n-1，因为需要查询下一个防止越界
        for (int i=0;i<length-1;i++){
            if(intervals[i+1][0]<=intervals[i][1]){
                intervals[i+1][0]=intervals[i][0];
                intervals[i+1][1]=Math.max(intervals[i+1][1],intervals[i][1]);
            }else {
                list.add(intervals[i]);
            }
        }
        list.add(intervals[length-1]);
        int[][] result=new int[list.size()][2];
        for (int i=0;i<list.size();i++) {
            result[i][0]=list.get(i)[0];
            result[i][1]=list.get(i)[1];

        }
        return result;
    }

    /**
     * 75.颜色分类
     * @param nums
     */
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int left=0;
        int right=nums.length-1;
        int mid=0;

        while (mid<=right){
            if(nums[mid]==0){
                this.swap(nums,mid++,left++);
            }else if(nums[mid]==2){
                this.swap(nums,mid,right--);
            }else {
                mid++;
            }
        }
    }

    public void swap(int[] nums,int aIndex,int bIndex){
        int temp=nums[aIndex];
        nums[aIndex]=nums[bIndex];
        nums[bIndex]=temp;
    }

    /**
     * 238 除自身以外数组乘积
     * @param nums
     * @return
     */
    public int[] productExceptSelf(int[] nums) {

        if(nums==null||nums.length==0){
            return null;
        }
        int length=nums.length;
        int[] left=new int[length];
        int[] right=new int[length];
        int[] result=new int[length];

        left[0]=1;
        for(int i=1;i<length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[length-1]=1;
        for (int i=length-2;i>=0;i--){
            right[i]=nums[i+1]*right[i+1];
        }
        for (int i=0;i<length;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }

    /**
     * 215 查找数组中的第k大元素
     *
     * 最小堆
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        //计算k和数组的关系，来初始化最小堆的大小
        int size=k;
        //k大于数组一半的长度，
        if(k>nums.length/2){
            size=nums.length-k+1;
            PriorityQueue<Integer> maxQueue=new PriorityQueue<>(size, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            for (int i = 0; i < size ; i++) {
                maxQueue.add(nums[i]);
            }
            for (int i = size; i < nums.length ; i++) {
                int topElement=maxQueue.peek();
                if(nums[i]<topElement){
                    maxQueue.poll();
                    maxQueue.add(nums[i]);
                }
            }
            return maxQueue.poll();
        }else {
            PriorityQueue<Integer> minQueue=new PriorityQueue<>(k);
            for (int i = 0; i < k; i++) {
                minQueue.add(nums[i]);
            }
            for (int i = k; i < nums.length; i++) {
                int topElement=minQueue.peek();
                if(nums[i]>topElement){
                    minQueue.poll();
                    minQueue.add(nums[i]);
                }
            }
            return minQueue.poll();
        }
    }

    public static void main(String[] args) {

        int[] test={1,2,3,4};
        ArraySolution solution=new ArraySolution();
        System.out.println(JSON.toJSONString(solution.productExceptSelf(test)));

    }

}
