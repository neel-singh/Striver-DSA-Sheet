// Problem: Find the Union
// Pattern: hash Set
// Time Complexity: O(nlogn)
// Space Complexity: O(1)

import java.util.*;

class FindTheUnion {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
         HashSet<Integer> res = new HashSet<>();

        for(int ele : a){
            res.add(ele);
        } 
        
        for(int ele : b){
            res.add(ele);
            
        }

        ArrayList<Integer> resArrayList = new ArrayList<>(res);
        Collections.sort(resArrayList);
        
        return resArrayList;
    }
}
