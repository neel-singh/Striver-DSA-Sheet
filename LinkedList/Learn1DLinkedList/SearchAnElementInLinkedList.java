// Problem: Search An Element in Linked-List
// Pattern: Traversing
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

class Search {
    public boolean searchKey(Node head, int key) {
        // Code here
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        
        return false;
    }
}
