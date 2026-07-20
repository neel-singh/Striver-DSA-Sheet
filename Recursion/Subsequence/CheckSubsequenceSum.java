class CheckSubsequenceSum{
  public boolean checkSubsequenceSum(int[] arr, int target){
    return fun(arr, target, 0, 0);
  }

  public boolean fun(int[] arr, int target, int i, int sum){
    if(sum > target){
      return false;
    }
    
    if(i == arr.length){
      return (sum == target);
    }

    sum += arr[i];
    if(fun(arr, target, i+1, sum) == true){
      return true;
    }
    
    sum -= arr[i];

    if(fun(arr, target, i+1, sum) == true){
      return true;
    }

    return false;
  }
}
  
