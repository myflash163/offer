import java.util.HashMap;

public class 复杂链表的复制 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public class Solution {
        public RandomListNode Clone(RandomListNode pHead) {
            if (pHead == null) return null;
            HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
            RandomListNode copy = new RandomListNode(pHead.label);
            map.put(pHead, new RandomListNode(pHead.label));

            RandomListNode p = pHead;
            while (p != null) {
                map.put(p, new RandomListNode(p.label));
                p = p.next;
            }
            p = pHead;
            RandomListNode q = copy;
            while (p != null) {
                q.next = map.get(p.next);
                q.random = map.get(p.random);
                p = p.next;
                q = q.next;
            }

            return copy;
        }
    }
}
