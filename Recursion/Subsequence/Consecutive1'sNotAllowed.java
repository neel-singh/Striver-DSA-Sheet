class Main{
  public int countString(int n){
    fun(n, 0, false);
  }

  public int fun(int n, int i, boolean isOne){
    if(i == n){
      return 1;
    }

    int res = fun(n, i+1, false);

    if(!isOne){
       res = fun(n, i+1, true);
    }

    return res;
  }
}
