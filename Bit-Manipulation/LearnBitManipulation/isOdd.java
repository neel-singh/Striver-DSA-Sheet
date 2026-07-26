class IsOdd {
    public boolean isOdd(int n){
      bitMask = 1 << 0;
      if((n & bitMask) == 0){
        return true;
      }

      return false;
    }
}
