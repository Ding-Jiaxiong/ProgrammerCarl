package LinkedList.LeetCode24;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 *
 * 思路：递归
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

    public static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;   // 没有节点或者一个节点直接返回【无需交换】

        ListNode nextHead = head.next;  // 保存第二个节点【这个节点最后会成为新的头结点】
        head.next = swapPairs(nextHead.next);  // 递归地对从第三个节点开始的子链表进行处理
        nextHead.next = head;  // 将当前链表的第一个节点连接到第二个节点的后面，完成交换

        return nextHead;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printLinkedList(node1);

        ListNode res = swapPairs(node1);

        printLinkedList(res);
    }
}
