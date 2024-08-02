package LinkedList.LeetCode206;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * <p>
 * 思路：双指针秒了
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

    public static ListNode reverseList(ListNode head) {

        ListNode cur = head;  // 指向头结点，用于遍历整个原链表

        ListNode pre = null;  // 组成新链表

        while (cur != null) {

            ListNode tmp = cur.next; // 暂存后继节点
            cur.next = pre;  // 修改当前引用
            pre = cur;
            cur = tmp;  // 下一个
        }

        return pre;

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

        ListNode res = reverseList(node1);

        printLinkedList(res);

    }
}
