// Problem: Find the size of Linked List
// Pattern: Traversing
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class Length {
    public int getCount(Node head) {
        // code here
        Node temp = head;
        int count = 0;
        
        while(temp != null){
            temp = temp.next;
            count++;
        }
        
        return count;
    }
}
