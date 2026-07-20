class CombinationSum{

  List<List<Integer>> res = new ArrayList<>();
  
  public List<List<Integer>> combinationSum(int[] candidates, int target){
    List<Integer> ans = new ArrayList<>();

    fun(candidates, target, 0, 0, ans);
    return res;
  }

  public void fun(int[] candidates, int target, int sum, int i, List<Integer> ans){
    if(sum == target){
      res.add(new ArrayList<>(ans));
      return;
    }

    if(sum > target || i >= candidates.length){
      return;
    }

    sum += candidates[i];
    ans.add(candidates[i]);
    fun(candidates, target, sum, i, ans);

    sum -= candidates[i];
    ans.remove(ans.size() - 1);

    fun(candidates, target, sum, i+1, ans);
  }
  
}
