class SingleNumber{
  public int unique(int[] nums){
    int res = 0;

    for(int ele : nums){
      res ^= ele;
    }

    return res;
  }
}
