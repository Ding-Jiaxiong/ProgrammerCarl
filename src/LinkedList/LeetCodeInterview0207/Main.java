package LinkedList.LeetCodeInterview0207;

import java.util.List;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 * <p>
 * 思路：这个有取巧的办法【双指针，一直走，强行一起走到汇合】
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode A = headA;
        ListNode B = headB;

        while (A != B) {

            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;

        }

        return A;

    }


    public static void main(String[] args) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);


        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);


        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        ListNode node8 = new ListNode(1);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node6.next = node7;
        node7.next = node8;
        node8.next = node3;


        System.out.println(getIntersectionNode(node1, node6).val);
    }
}
