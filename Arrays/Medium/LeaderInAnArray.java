// probelem: Leader In An Array
// pattern: Backward Traversing
// Tiime Complexity: O(n)
// Space complexity: O(n)

import java.util.*;

class LeaderInAnArray {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        int max = arr[arr.length-1];
        res.add(arr[arr.length-1]);
        
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] >= max){
                max = arr[i];
                res.add(arr[i]);
            }
        }
        
        Collections.reverse(res);
        
        return res;
    }
}
