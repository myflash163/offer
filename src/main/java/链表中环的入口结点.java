public class 链表中环的入口结点 {

     public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {

        public ListNode EntryNodeOfLoop(ListNode pHead)
        {
            if(pHead == null) return null;
            ListNode fast;
            ListNode slow = pHead.next;
            if(slow == null) return null;
            fast = slow.next;
            if(fast == null) return null;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                if(fast == null) return null;
                fast = fast.next;
                if(fast == null) return null;
            }
            //找到一点，两者同时走到
            fast = pHead;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
    }
}
