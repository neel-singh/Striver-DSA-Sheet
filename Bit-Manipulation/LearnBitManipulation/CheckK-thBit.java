class CheckBit {
    public boolean checkKthBit(int n, int k) {
      int bitMask = 1 << k;
      
      if((bitMask & n) == 0){
        return false;
      }

      return true;
    }
}
