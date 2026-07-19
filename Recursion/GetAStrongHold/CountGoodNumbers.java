class CountGoodNumbers{

  long mod = 1000000007;
  
  public int countGoodNumber(long n){
    if(n % 2 == 0){
      return (int) ((oddFun(n/2) * evenFun(n/2)) % mod);
    }

    return (int) ((oddFun(n/2) * evenFun(n/2 + 1)) % mod);
  }

  public long oddFun(){
    if(n == 0){
      return 1;
    }

    long half = oddFun(n/2);

    if(n % 2 == 0){
      return (half * half) % mod;
    }

    return (half * half * 4) % mod;
  }

  public long evenFun(){
    if(n == 0){
        return 1;
      }

    long half = evenFun(n/2);

    if(n % 2 == 0){
      return (half * half) % mod;
    }

    return (half * half * 5) % mod;
  }
}
