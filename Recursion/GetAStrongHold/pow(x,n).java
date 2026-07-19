class Pow{
  public double pow(double x, int n){
    if(n < 0){
      x = 1/x;
      n = n * (-1);
    }

    return fun(x, n);
  }

  public int fun(double x, int n){
    if(n == 0){
      return 1;
    }

    double half = fun(x/2, n);

    if(n%2 == 0){
      return half * half;
    }

    return half * half * x;
}
