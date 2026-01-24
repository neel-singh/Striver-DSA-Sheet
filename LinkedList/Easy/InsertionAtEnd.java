// Problem: Insert valur at End
// Pattern: Traversing
// Time Complexity: O(n)
// Space Complexity: O(1)

import javva.util.*;

class addLast {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        
        if(head == null){
            head = newNode;
            return head;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = newNode;
        
        return head;
    }
}
