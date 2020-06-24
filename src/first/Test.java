package first;

import java.util.LinkedList;

/**
 * @Describe TODO
 */
public class Test {

    public ListNode deleteDuplicates(ListNode head) {
        // 声明一个链表变量，从头遍历链表（指向链表的表头）
        ListNode cur = head;
        while (cur != null && cur.next != null){
            // 跳过值相同的链表节点。
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                // 如果值不相等，则跳到下一个节点
                cur = cur.next;
            }
        }
        return head;
    }
    public void outPutList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val);
            if (tmp.next != null) {
                // 如果不是最后一个节点，则输出一个逗号分隔符
                System.out.print(",");
            } else {
                // 如果是链表的最后一个节点，则换行
                System.out.println();
            }
            tmp = tmp.next;
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        // 构建有序链表
        ListNode head = new ListNode(0);//维护头节点
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(3);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        // 测试
        System.out.println("原始链表是：");
        t.outPutList(head);
        // 删除重复值
        ListNode res = t.deleteDuplicates(head);
//        t.deleteDuplicates(n1);

        System.out.println("删除重复后的链表是：");
        t.outPutList(res);
        t.outPutList(n1);
    }

}
 class ListNode extends LinkedList {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
     }
}
