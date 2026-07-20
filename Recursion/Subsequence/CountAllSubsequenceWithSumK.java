class SubsequenceSum{
  public int subsequencSum(int[] arr, int target){
    return fun(arr, target, 0, 0);
  }

  public int fun(int[] arr, int target, int sum, int i){
    if(i == arr.length){
      if(sum == target){
        return 1;
      }
      return 0;
    }

    sum += arr[i];
    int count1 = fun(arr, target, sum, i+1);
    sum -= arr[i];
    int count2 = fun(arr, target, sum, i+1);

    return (count1 + count2);
  }
}
