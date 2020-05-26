
public class ReverseLinkedList {

    public class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode reverseListIter(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public ListNode reverseListReq(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListReq(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}