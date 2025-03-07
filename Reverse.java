class Solution {
       public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        ListNode prev = null;
        while( curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}