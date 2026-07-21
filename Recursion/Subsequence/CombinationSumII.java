class CombinationSum{

  List<List<Integer>> res = new ArrayList<>();
  
  public List<List<Integer>> combinationSum(int[] candidates, int target){
    List<Integer> ans = new ArrayList<>();

    Arrays.sort(candidates);
    fun(candidates, target, 0, 0, ans);
    return res;
  }

  public void fun(int[] candidates, int target, int i, int sum, List<Integer> ans){
    if(sum == target){
      res.add(new ArrayList<>(ans));
      return;
    }

      for(int j = i; j < candidates.length; j++){
        if(j == candidates.length || sum + candidates[j] > target){
          break;
        }
  
        if(j > i && candidates[j] == candidates[j-1]){
          continue;
        }
  
        sum += candidates[j];
        ans.add(candidates[j]);
        fun(candidates, target, j+1, sum, ans);
        sum -= candidates[j];
        ans.remove(ans.size() - 1);
    }
  }
}
