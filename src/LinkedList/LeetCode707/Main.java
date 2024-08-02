package LinkedList.LeetCode707;

/**
 * 你可以选择使用单链表或者双链表，设计并实现自己的链表。
 *
 * 思路：根据具体函数要求实现
 *
 * @@author Ding Jiaxiong
 */

public class Main {

    //单链表写法
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    class MyLinkedList {

        int size;  // 存储链表元素个数
        ListNode dummy;  // 虚拟头结点


        public MyLinkedList() {
            size = 0;
            dummy = new ListNode();
        }

        // 获取第 index 个节点的数值
        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }

            ListNode cur = dummy;

            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }

            return cur.val;
        }

        // 在链表最前面插入一个节点
        public void addAtHead(int val) {
            ListNode newNode = new ListNode(val);
            newNode.next = dummy.next;
            dummy.next = newNode;

            size++;
        }

        // 在链表尾部插入一个节点
        public void addAtTail(int val) {
            ListNode newNode = new ListNode(val);
            ListNode cur = dummy;

            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = newNode;
            size++;
        }

        // 在指定 index 插入新节点
        public void addAtIndex(int index, int val) {

            if (index > size) return;

            if (index < 0) index = 0;

            size++;

            ListNode pre = dummy;
            for (int i = 0; i < index; i++) {
                pre = pre.next;
            }

            ListNode toAdd = new ListNode(val);
            toAdd.next = pre.next;
            pre.next = toAdd;
        }

        // 删除 index 节点
        public void deleteAtIndex(int index) {

            if (index < 0 || index >= size) return;

            size--;

            ListNode pre = dummy;

            for (int i = 0; i < index; i++) {
                pre = pre.next;
            }

            pre.next = pre.next.next;
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

    public static void main(String[] args) {


    }
}
