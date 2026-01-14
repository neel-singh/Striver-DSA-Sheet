// Problem: Pascal's Triangle
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        ArrayList<Integer> prev = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();

        for(int i = 0; i < numRows+1; i++){
            if(i == 0){
                continue;
            }

            else if(i == 1){
                curr.add(1);
                res.add(new ArrayList<>(curr));
                curr.clear();
            }

            else if(i == 2){
                curr.add(1);
                curr.add(1);
                res.add(new ArrayList<>(curr));
                prev.addAll(new ArrayList<>(curr));
                curr.clear();
            }

            else{
                curr.add(1);
                int n = 0;
                while(n < i-2){
                    curr.add(prev.get(n) + prev.get(n+1));
                    n++;
                }
                curr.add(1);
                res.add(new ArrayList<>(curr));

                prev.clear();
                prev.addAll(new ArrayList<>(curr));
                curr.clear();
            }
        }

        return res;
    }
}
