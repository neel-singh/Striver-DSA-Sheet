// Problem: Middle of the Linked List
// Pattern: Traversal
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
class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;

        ListNode temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        ListNode newTemp = head;

        for(int i = 0; i < len/2; i++){
            newTemp = newTemp.next;
        }
            head = newTemp;

        return head;
    }
}
