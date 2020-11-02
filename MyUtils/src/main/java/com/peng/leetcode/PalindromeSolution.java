package com.peng.leetcode;

import com.peng.leetcode.bo.ListNode;

/**
 * @author peng.wang
 * @Description 回文系列
 *
 * @createTime 2020/5/29
 */
public class PalindromeSolution {

    /**
     09 回文数
     * 解题思路
     *
     * 取出后半段数字进行翻转
     *
     * 伪代码
     *
     * 无效数字直接返回：无效数字，小于0负数，不对称，小于10的数字不对称
     *
     * 每次进行取余操作 （ %10），取出最低的数字：y = x % 10将最低的数字加到取出数的末尾：
     * revertNum = revertNum * 10 + y每取一个最低位数字，
     * x 都要自除以 10判断 x 是不是小于 revertNum ，当它小于的时候，说明数字已经对半或者过半了最后，
     * 判断奇偶数情况：如果是偶数的话，revertNum 和 x 相等；
     * 如果是奇数的话最中间的数字就在revertNum 的最低位上，将它除以 10 以后应该和 x 相等。
     *
     * @param x
     * @return
     */
    public boolean isPalindromeNum(int x) {
        boolean inValidNum=x<0||(x%10==0&&x!=0);
        if(inValidNum){
            return false;
        }
        int revertedNumber=0;
        while (x>revertedNumber){
            //翻转数赋值，循环一次增加一位
            revertedNumber = revertedNumber * 10 + x % 10;
            //x抹去1位
            x /= 10;
        }
        //完全相等，或者多一位取整相等
        return x == revertedNumber || x == revertedNumber / 10;
    }

    /**
     * 234 回文链表
     *
     * 解题思路
     *
     * 通过快慢指针找到中心，以中心为原点对链表进行翻转，然后比较翻转后的和未翻转的链表
     *
     * @param head
     * @return
     */
    public boolean isPalindromeListNode(ListNode head){

        if(head==null||head.next==null){
            return false;
        }
        if(head.next.next==null){
            return head.val==head.next.val;
        }
        //快慢指针找中心点slow
        ListNode slow=head.next;
        ListNode fast=head.next.next;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //翻转链表
        ListNode newNode=null;
        ListNode temp;
        while (slow!=null){
            temp=slow.next;
            slow.next=newNode;
            newNode=slow;
            slow=temp;
        }

        ListNode tail=newNode;
        while (head!=null){
            if(head.val!=tail.val){
                return false;
            }
            head=head.next;
            tail=tail.next;
        }
        return true;
    }


    /**
     * 5 最长回文数
     *
     * 解题思路，动态规划
     *
     * 回文去掉两头仍是回文，在头尾字符相等的情况下，里面子串的回文性质据定了整个子串的回文性质
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        if(s.length()<2){
            return s;
        }
        int maxLength=1;
        int begin=0;

        boolean[][] dp=new boolean[s.length()][s.length()];
        char[] chars= s.toCharArray();
        for(int j=1;j<chars.length;j++){
            for (int i=0;i<j;i++){
                if(chars[i]!=chars[j]){
                    dp[i][j]=false;
                }else {
                    if(j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j]=dp[i+1][j-1];
                    }
                }

                if(dp[i][j]&&j-i+1>maxLength){
                    maxLength=j-i+1;
                    begin=i;
                }
            }
        }

        return s.substring(begin,begin+maxLength);
    }


    public static void main(String[] args) {
        String test="abbbcccbbbaadesca";
        PalindromeSolution palindromeSolution =new PalindromeSolution();
        System.out.println(palindromeSolution.longestPalindrome(test));
    }

}
