package com.peng.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.List;

/**
 * @author peng.wang
 * @Description 动态规划
 * @createTime 2020/6/15
 */
public class DynamicPlanningSolution {

    /**
     * 爬楼梯
     * leetcode 70
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        return dp[n];

    }

    /**
     * 96 不同的二叉搜索树
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }

    /**
     * 打家劫舍
     * <p>
     * leetcode 198
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {

        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int[] result = new int[length + 1];
        result[0] = 0;
        result[1] = nums[0];
        for (int i = 2; i <= length; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + nums[i - 1]);
        }
        return result[length];
    }

    /**
     * 139单次拆分
     *
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak(String s, List<String> wordDict) {

        int length = s.length();
        boolean[] dp = new boolean[length + 1];
        dp[0] = true;

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[length];
    }

    /**
     * 494 目标和
     * 把所有符号为正的数总和设为一个背包的容量容量为`x`；
     * 把所有符号为负的数总和设为一个背包的容量 容量为`y`。
     * 在给定的数组中，有多少种选择方法让背包装满。令`sum`为数组的总和，则`x+y = sum`。
     * 而两个背包的差为`S`,则`x-y=S`。从而求得`x=(S+sum)/2`。
     * 基于上述分析，题目转换为背包问题：给定一个数组和一个容量为x的背包，求有多少种方式让背包装满
     *
     * @param nums
     * @param S
     * @return
     */
    public int findTargetSumWays(int[] nums, int S) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (S > sum || (S + sum) % 2 == 1) {
            return 0;
        }
        int length = (S + sum) / 2;
        int[] dp = new int[length + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = length; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[length];
    }

    /**
     * 0/1背包问题（一维数组）
     *
     * @param weight
     * @param value
     * @param capacity
     * @return
     */
    public int zeroOrOnePacksack(int[] weight, int[] value, int capacity) {
        int[] dp = new int[capacity + 1];
        for (int i = 1; i < weight.length + 1; i++) {
            //逆序实现
            for (int j = capacity; j >= weight[i - 1]; j--) {
                dp[j] = Math.max(dp[j - weight[i - 1]] + value[i - 1], dp[j]);
            }
        }
        return dp[capacity];
    }

    /**
     * 0/1背包问题（二维数组，方便理解）
     *
     * @param weight   重量
     * @param value    价值
     * @param capacity 背包容量
     * @return
     */
    public int zeroOrOnePacksack4TwoArray(int[] weight, int[] value, int capacity) {
        if (weight.length != value.length) {
            return 0;
        }
        //重量为i，容量j的最大价值
        int[][] dp = new int[weight.length + 1][capacity + 1];

        for (int i = 1; i < weight.length + 1; i++) {
            for (int j = 1; j < capacity + 1; j++) {
                if (i == 0 || j == 0) {
                    continue;
                }
                if (j < weight[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }
        //填充的表格
        for (int[] ints : dp) {
            System.out.println(JSON.toJSONString(ints));
        }
        //最大价值
        int maxValue = dp[weight.length][capacity];

        // 从最优解，倒推回去找
        int j = capacity;
        for (int i = weight.length - 1; i > 0; i--) {
            // 在最优解中，v[i][j]>v[i-1][j]说明选择了第i个商品
            if (dp[i][j] > dp[i - 1][j]) {
                System.out.println("选择了第" + i + "件物品");
                j = j - weight[i - 1];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
    }

    /**
     * 221 最大正方形
     *
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        int maxSize = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        //dp定义，以dp为右下角的点，最大的正方形变长，结果就是在最大变长的平方
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        //公式很神奇，原理见1277
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                }
                maxSize = Math.max(maxSize, dp[i][j]);
            }
        }
        return maxSize * maxSize;
    }

    /**
     * 1277 全为1的正方形子矩阵
     *
     * @param matrix
     * @return
     */
    public int countSquares(int[][] matrix) {
        int count = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        //dp定义，以dp为右下角的点，最大的正方形变长，结果就是所有累加和
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        //推理思路
                        //以dp[i][j]为基点，则其他三个边缘点至少要等于dp[i][j]-1，
                        // 即最小的边缘值+1<=dp[i][j]
                        //以边缘点为基点，则推断出最小的边缘值+1>=dp[i][j]
                        //二者结合则推断出相等关系
                        //或者换个思路，dp的值是强依赖边缘的最小值，只能以最小值的基础扩张
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                }
                count += dp[i][j];
            }
        }
        return count;
    }

    /**
     * 279 完全平方数
     *
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }


    /**
     * 322
     *
     * @param coins
     * @param amount
     * @return
     */
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return -1;
        }

        int dp[] = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] < min) {
                    min = dp[i - coins[j]] + 1;
                }
            }
            dp[i] = min;
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];

    }

    /**
     * 338 比特位计数
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] result=new int[num+1];

        for (int i = 0; i <= num; i++) {
            if(i%2==0){
                result[i]=result[i/2];
            }else {
                result[i]=result[i-1]+1;
            }
        }

        return result;
    }

    /**
     * 309 买卖股票 冷却期
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        // f[i][0]: 手上持有股票的最大收益
        // f[i][1]: 手上不持有股票，并且处于冷冻期中的累计最大收益
        // f[i][2]: 手上不持有股票，并且不在冷冻期中的累计最大收益
        int n=prices.length;
        int[][] f=new int[n][3];
        f[0][0]=-prices[0];
        for (int i = 1; i < n; i++) {
            f[i][0] = Math.max(f[i - 1][0], f[i - 1][2] - prices[i]);
            f[i][1] = f[i - 1][0] + prices[i];
            f[i][2] = Math.max(f[i - 1][1], f[i - 1][2]);
        }

        return Math.max(f[n - 1][1], f[n - 1][2]);

    }

}
