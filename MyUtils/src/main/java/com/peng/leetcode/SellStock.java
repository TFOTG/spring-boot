package com.peng.leetcode;

/**
 * @author peng.wang
 * @Description 买卖股票系列问题
 * @createTime 2020/6/2
 */
public class SellStock {

    /**
     * 121 逻辑就是，循环过程中寻找最小值，找到最小值之后寻找最大收益
     *
     * 最小值是不断变化的，最大值也是，所以只输出最大的一个即可
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        SellStock sellStock=new SellStock();
        int[] test1=new int[]{2,15,1,3,7};
        System.out.println(sellStock.maxProfit(test1));
    }

}
