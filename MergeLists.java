/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
public class MergeLists {
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2==null) return l1==null? l2 : l1;
        ListNode head = new ListNode(0);
        head.next = l1;
        ListNode p1 = head;
        ListNode p2 = l2; 

        while(p1.next!=null && p2!=null){
            if(p2.val<p1.next.val){
                ListNode temporal = p2;
                p2 = p2.next;
                temporal.next = p1.next;
                p1.next = temporal;
            }
            p1 = p1.next;
        }
        if(p1.next == null && p2!=null) p1.next = p2;
        return head.next;
    }
}