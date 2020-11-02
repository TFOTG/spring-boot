package com.peng.leetcode.test;

import com.peng.leetcode.BitArithmeticSolution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 位运算测试类
 */
public class BitArithmeticSolutionTest {

    private BitArithmeticSolution solution;

    @Before
    public void setUp() throws Exception {
        solution=new BitArithmeticSolution();
    }

    @Test
    public void divide() {

        Assert.assertEquals(100,solution.divide(201,2));
        Assert.assertEquals(-3,solution.divide(7,-2));
        Assert.assertEquals(3,solution.divide(-7,-2));

    }
}