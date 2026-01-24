// Problem: Reverse Linked List
// Pattern: Three-Pointer Technique
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

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
class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        if(head == null){
            return head;
        }

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }
    
}
