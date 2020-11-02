package com.peng.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author peng.wang
 * @Description 栈
 * @createTime 2020/6/15
 */
public class StackSolution {


    /**
     * 有效括号
     * leetcode 20
     * @param s
     * @return
     */
    public boolean isValidBracket(String s) {


        Map<Character,Character> map=new HashMap<>(4);
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        map.put('?','?');

        if(s.length()>0&&!map.containsKey(s.charAt(0))){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.push('?');
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)){
                stack.push(c);
            }else {
                Character topC=stack.pop();
                if(!map.get(topC).equals(c)){
                    return false;
                }
            }
        }

        return  stack.size()==1;

    }

    public static void main(String[] args) {
        StackSolution stackSolution=new StackSolution();
        String test="(((())))";
        boolean v= stackSolution.isValidBracket(test);
        System.out.println(v);
    }



}
