class Subset{
  public List<Integer> subset(int[] nums){
    List<Integer> res = new ArrayList<>();

    fun(nums, 0, 0, res);

    return res;
  }

  public void fun(int[] nums, int sum, int i, List<Integer> res){
    if(i == nums.length){
      res.add(sum);
      return;
    }

    sum += nums[i];
    fun(nums, sum, i+1, res);
    sum -= nums[i];

    fun(nums, sum, i+1, res);
  }
}
    
