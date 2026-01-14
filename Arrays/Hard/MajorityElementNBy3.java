// Problem: Majority Element II (elements appearing more than n/3 times)
// Pattern: Hashing
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();

        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length;

        for(int ele : nums){
            if(freq.containsKey(ele)){
                freq.put(ele, freq.get(ele)+1);
            }
            else{
                freq.put(ele, 1);
            }
        }

        for(int ele : freq.keySet()){
            if(freq.get(ele) > n/3){
                res.add(ele);
            }
        }

        return res;
    }
}
