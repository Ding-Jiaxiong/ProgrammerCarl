package LinkedList.LeetCode19;

import java.util.List;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 思路：双指针
 *
 * @author Ding Jiaxiong
 */

public class Main {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void printLinkedList(ListNode head) {

        while (head != null) {


            if (head.next == null) {
                System.out.print(head.val);
            } else {
                System.out.print(head.val + " → ");
            }

            head = head.next;
        }
        System.out.println();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // 虚拟头结点
        ListNode dummy = new ListNode();

        dummy.next = head;

        ListNode fast = dummy; // 快指针
        ListNode slow = dummy; // 慢指针

        // 快指针先走 n 步
        while (n > 0) {
            fast = fast.next;
            n--;
        }

        // 快指针和慢指针一起走，快指针走到头
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 这个时候慢指针指向的就是 要删除节点的前一个节点
        slow.next = slow.next.next;

        return dummy.next;
    }


    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printLinkedList(node1);

        ListNode res = removeNthFromEnd(node1, 2);

        printLinkedList(res);

    }

}
