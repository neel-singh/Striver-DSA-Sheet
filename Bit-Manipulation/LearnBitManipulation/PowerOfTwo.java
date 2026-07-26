class PowerOfTwo{
  public boolean isPower(int n){
    if(n > 0){
      if((n & (n-1)) == 0){
        return true;
      }
      return false;
    }
    return false;
  }
}
