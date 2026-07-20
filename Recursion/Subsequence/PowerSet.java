Class PoweSet{
  List<String> res = new ArrayList<>();
  
  public List<String> powerSet(String s){
    StringBuilder() sb = new StringBuilder();
    
    fun(s, 0, sb, res);
    return Collections.sort(res);
  }

  public void fun(String s, int i, StringBuilder sb, List<String> res){
    if(i == s.length()){
      res.add(sb.toString());
      return;
    }

    sb.append(s.charAt(i));

    fun(s, i+1, sb, res);
    sb.deleteCharAt(sb.length()-1);

    fun(s, i+1, sb, res);
  }
}
