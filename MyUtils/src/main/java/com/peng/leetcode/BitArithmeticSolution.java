package com.peng.leetcode;

/**
 * @author peng.wang
 * @Description 位运算
 * @createTime 2020/6/17
 */
public class BitArithmeticSolution {

    /**
     * 汉明距离
     *
     * leetcode 461
     *
     * 位运算
     *
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int distance=0;

        while (xor!=0){
            if(xor%2==1){
                ++distance;
            }
            xor=xor>>1;
        }
        return distance;
    }

    /**
     * 29 两数相除
     *
     * 除数按照二倍扩大
     *
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {

        if((dividend==Integer.MIN_VALUE)&&(divisor==-1)){
            return Integer.MAX_VALUE;
        }
        if(divisor==1){
            return dividend;
        }else if(divisor==-1){
            return -dividend;
        }

        int sign = ((dividend>0)^(divisor>0))?-1:1;

        long absolute_divisor=Math.abs((long)divisor);
        long absolute_dividend=Math.abs((long)dividend);
        int count=0;
        //外层循环修正,计算不能被2^n 除净的数字，依次减
        while (absolute_dividend>=absolute_divisor){
            long temp_divisor=absolute_divisor;
            long t=1;
            while (absolute_dividend>=(temp_divisor<<1)){
                temp_divisor<<=1;
                t<<=1;
            }
            count+=t;
            absolute_dividend-=temp_divisor;

        }
        return sign>0?count:-count;
    }

}
