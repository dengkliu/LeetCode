/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
public class RemoveNode {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
         if(head == null) return head;
         
         ListNode dummy = new ListNode(1);
         ListNode i = dummy;
         ListNode j = dummy;
         dummy.next = head;
         int count = 0;
         
         while(count != n){
             j = j.next;
             count++;
         }
         
         while(j.next != null){
             i = i.next;
             j = j.next;
         }
         
         i.next = i.next.next;
         return dummy.next;
    }
}