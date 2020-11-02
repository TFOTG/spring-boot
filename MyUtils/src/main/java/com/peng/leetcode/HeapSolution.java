package com.peng.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author peng.wang
 * @Description 堆
 * @createTime 2020/9/11
 */
public class HeapSolution {

    /**
     * 347 前k个高频元素
     *
     * 高频元素用map统计
     * 前k个则使用最小堆存放
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        if(nums==null||nums.length==0){
            return nums;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        PriorityQueue<Integer> minHeap=new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });

        for(int key:map.keySet()){
            if(minHeap.size()<k){
                minHeap.add(key);
            }else if(map.get(key)>map.get(minHeap.peek())){
                minHeap.remove();
                minHeap.add(key);
            }
        }

        int i=0;
        int[] result=new int[minHeap.size()];
        while (!minHeap.isEmpty()){
            result[i]=minHeap.remove();
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test={1,1,1,2,2,3};
        HeapSolution solution=new HeapSolution();
        System.out.println(JSON.toJSONString(solution.topKFrequent(test,2)));

    }

}
