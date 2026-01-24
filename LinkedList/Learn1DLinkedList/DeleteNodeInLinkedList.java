// Problem: Deleting a node in LinkedList
// Pattern: Pointer Manipulation
// Time Complexity: O(1)
// Space Complexity: O(1)

import java.util.*;

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
