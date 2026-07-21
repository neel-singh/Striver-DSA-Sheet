class CombinationSum{

  List<List<Integer>> res = new ArrayList<>();
  
  public List<List<Integer>> combinationSum(int n, int k){

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    List<Integer> ans = new ArrayList<>();

    fun(k, n, arr, 0, 0, ans);
    
    return res;
  }

  public void fun(int k, int n, int[] arr, int sum, int i, List<Integer> ans){
    if(sum == n && ans.size() == k){
      res.add(new ArrayList<>(ans));
      return;
    }

    if(i >= arr.length || sum > n){
      return;
    }

    sum += arr[i];
    ans.add(arr[i]);
    fun(k, n, arr, sum, i+1, ans);
    sum -= arr[i];
    ans.remove(ans.size() - 1);

    fun(k, n, arr, sum, i+1, ans);
  }
}
