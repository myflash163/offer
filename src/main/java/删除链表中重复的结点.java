public class 删除链表中重复的结点 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ListNode deleteDuplication(ListNode pHead) {
            if (pHead == null) return null;
            if (pHead.next == null) return pHead;
            ListNode head = new ListNode(-1);
            head.next = pHead;
            ListNode pre = head;
            ListNode cur = head.next;
            while (cur != null) {
                if (cur.next != null && cur.next.val == cur.val) {
                    while (cur.next != null && cur.next.val == cur.val) {
                        cur = cur.next;
                    }
                    cur = cur.next;
                    pre.next = cur;
                } else {
                    cur = cur.next;
                    pre = pre.next;
                }
            }


            return head.next;

        }
    }

}
