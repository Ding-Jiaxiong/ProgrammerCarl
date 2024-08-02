package LinkedList.LeetCode203;

/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *
 * 思路：常规【虚拟节点思想】
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

    public static ListNode removeElements(ListNode head, int val) {

        // 特判
        if (head == null) return null;

        ListNode dummy = new ListNode(); // 虚拟节点
        dummy.next = head;

        // 当前节点
        ListNode cur = dummy;

        while (cur.next != null) {

            if (cur.next.val == val) {
                cur.next = cur.next.next;  // 移除其实就是破坏指向关系【绕过他】
            } else {
                cur = cur.next;
            }

        }

        return dummy.next;

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

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        printLinkedList(node1);

        ListNode res = removeElements(node1, 1);

        printLinkedList(res);

    }
}
