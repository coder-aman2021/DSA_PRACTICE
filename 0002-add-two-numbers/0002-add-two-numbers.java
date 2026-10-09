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
    public ListNode rev(ListNode l){
        ListNode prev  = null ;
        ListNode temp = l  ;
        while(temp!=null){
            ListNode curr  = temp.next  ;
            temp.next  = prev ;
            prev  = temp ;
             temp = curr ;
        }
        return prev ;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode temp1 = l1 ;
        ListNode temp2  = l2;
       // int sum = 0 ;
        int carry = 0 ;
            ListNode dummy = new ListNode(0) ;
             ListNode temp = dummy ;
        while(temp1!=null||temp2!=null || carry!=0){
           int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;

            int sum = val1 + val2 + carry;

            carry = sum/10 ;
            int digit  = sum%10 ;
            temp.next = new ListNode(digit) ;
            temp = temp.next  ;
            if(temp1!=null)
           temp1 =  temp1.next  ;
            if(temp2!=null)
            temp2 = temp2.next  ;

        }
        return dummy.next  ;
      

    }
}