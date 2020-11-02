package com.peng.leetcode;

import com.peng.leetcode.bo.ListNode;

/**
 * @author peng.wang
 * @Description 链表类型题目
 * @createTime 2020/7/2
 */
public class LinkedListSolution {


    /**
     * 两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result=new ListNode(0);

        ListNode p=l1,q=l2,curr=result;

        int carry=0;

        while (p!=null||q!=null){
            int x=(p==null)?0:p.val;
            int y=(q==null)?0:q.val;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(p!=null){
                p=p.next;
            }
            if(q!=null){
                q=q.next;
            }
        }
        if (carry==1){
            curr.next=new ListNode(1);
        }

        return result.next;
    }
    /**
     * leetcode 19 删除链表倒数第n个节点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;
        for(int i=0;i<n+1;i++){
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }

    /**
     * 链表翻转
     * @param head
     * @return
     */
    public  ListNode reverse(ListNode head){
        if (head == null){
            return null;
        }
        //当前指针
        ListNode cur = head;
        //生成的新链表的指针
        ListNode newHead = null;
        while(cur != null){
            //先备份当前节点的下个节点指针，相当于把当前节点从原链表切开,保留下个节点的链接，以供下次遍历使用
            ListNode oldHead = cur.next;
            //把当前节点和新链表节点连接
            cur.next = newHead;
            //新链表指针移动到新节点
            newHead = cur;
            //移动当前指针到旧链表上的下个节点,进行下次遍历
            cur = oldHead;
        }

        return newHead;

    }

    /**
     * 翻转链表
     * leetcode206
     *
     * 不断赋值给前一个节点，然后返回前一个节点
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        //前一个节点
        ListNode pre=null;
        //当前节点
        ListNode curr=head;
        while (curr!=null){
            ListNode temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;

        }
        return pre;

    }

    /**
     * 21 合并有序链表，递归
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }
    }

    /**
     * 142 环形链表II 找到相遇点
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
               break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    /**
     * 148 排序链表 递归 归并排序
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode fast=head.next.next;
        ListNode low=head;
        //快慢指针找到中间点，low点就是中间
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            low=low.next;
        }
        ListNode left=sortList(low.next);
        low.next=null;
        ListNode right=sortList(head);

        ListNode newHead=new ListNode(0);
        fast=newHead;
        while (left!=null&&right!=null){
            if(left.val<=right.val){
                fast.next=left;
                left=left.next;
            }else {
                fast.next=right;
                right=right.next;
            }
            fast=fast.next;
        }
        fast.next=left==null?right:left;
        return newHead.next;
    }

}
