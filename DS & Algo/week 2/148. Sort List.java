/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;                
        }
        temp.next = null;
        
        ListNode leftSort = sortList(head);
        ListNode rightSort = sortList(slow);
        
        return merge(leftSort,rightSort);
    }
    public ListNode merge(ListNode h1,ListNode h2){
         ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                curr.next = h1;              
                h1 = h1.next;                
            }else{
                curr.next = h2;
                h2 = h2.next;
            }
            curr = curr.next;
        }
        if(h1!=null){
            curr.next = h1;
            h1 = h1.next;
        }
        if(h2!=null){
            curr.next = h2;
            h2 = h2.next;
            }
        return temp.next;
    }
}
