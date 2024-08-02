package LinkedList.LeetCode142;

/**
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * <p>
 * 思路：快慢双指针
 *
 * @author Ding Jiaxiong
 */

public class Main {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {

        ListNode slow = head; //
        ListNode fast = head;

        while (true) {

            if (fast == null || fast.next == null) return null;  // 只有一个节点不会有环

            fast = fast.next.next;  // 快指针一次走两步
            slow = slow.next;  // 慢指针一次走一步

            if (fast == slow) {  // 走到重合
                break; // 跳出
            }
        }

        fast = head;  // 快指针重新回到头
        while (fast != slow) {  // 同样速度再次出发

            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }


    public static void main(String[] args) {

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(detectCycle(node1).val);

    }
}
