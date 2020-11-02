package com.peng.leetcode.test;

import com.alibaba.fastjson.JSON;
import com.peng.leetcode.DynamicPlanningSolution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author peng.wang
 */
public class DynamicPlanningSolutionTest {

    private DynamicPlanningSolution solution;

    @Before
    public void setUp() throws Exception {
        solution=new DynamicPlanningSolution();
    }

    @Test
    public void maximalSquare() {
        char[][] matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        int square= solution.maximalSquare(matrix);
        Assert.assertEquals(4,square);

    }

    @Test
    public void countSquaresTest() {

        int[][] matrix={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int square= solution.countSquares(matrix);
        Assert.assertEquals(15,square);

    }

    @Test
    public void numSquaresTest() {

        int count= solution.numSquares(12);
        Assert.assertEquals(3,count);

    }

    @Test
    public void countBitsTest() {

        int[] count= solution.countBits(5);
        System.out.println(JSON.toJSONString(count));

    }

}