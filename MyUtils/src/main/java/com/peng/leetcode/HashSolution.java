package com.peng.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author peng.wang
 * @Description hash类算法
 * @createTime 2020/8/17
 */
public class HashSolution {

    /**
     * 49 字母异位词
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();
        if (strs!=null||strs.length>0){
            for (String str : strs) {
                char[] arr= str.toCharArray();
                Arrays.sort(arr);
                String key=String.valueOf(arr);
                if(map.containsKey(key)){
                    map.get(key).add(str);
                }else {
                    List<String> list=new ArrayList<>();
                    list.add(str);
                    map.put(key, list);
                }
            }
        }

        return new ArrayList<List<String>>(map.values());
    }

    /**
     * 560 和为k的子数组
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {

        int preSum=0;
        int result=0;
        Map<Integer, Integer> preSumMap=new HashMap<>();
        preSumMap.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            preSum+=nums[i];
            if(preSumMap.containsKey(preSum-k)){
                result+=preSumMap.get(preSum-k);
            }
            preSumMap.put(preSum,preSumMap.getOrDefault(preSum,0)+1);
        }
        return result;
    }

    public static void main(String[] args) {
       int[] strArray= {1,1,1};

        HashSolution solution=new HashSolution();
        System.out.println(solution.subarraySum(strArray,2));

    }

}
