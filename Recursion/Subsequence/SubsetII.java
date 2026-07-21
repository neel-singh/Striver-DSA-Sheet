class Subset{

  List<List<Integer>> res = new ArrayList<>();
  
  public List<List<Integer>> subsetsWithDup(int[] nums){
    Array.sort(nums);
    List<Integer> ans = new ArrayList<>();

    fun(nums, 0, ans);
    return res;
  }

  public void fun(int[] nums, int i, List<Integer> ans){
    res.add(new ArrayList<>(ans));

    for(int j = i; j < nums.length; j++){
      if(j > i && nums[j] == nums[j-1]){
        continue;
      }

      ans.add(nums[j]);
      fun(nums, j+1, ans);
      ans.remove(ans.size() - 1);
    }
  }
}
