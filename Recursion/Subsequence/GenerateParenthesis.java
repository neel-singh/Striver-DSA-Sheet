class GenerateParenthesis{

  List<String> res = new ArrayList<>();
  
  public List<String> generateParenthesis(int n){
    StringBuilder sb = new StringBuilder();

    fun(n, 0, 0, sb, res);
    return res;
  }

  public void fun(int n, int open, int close, StringBuilder sb, List<String> res){
    if(open == n && close == n){
      res.add(sb.toString());
      return;
    }

    if(open < n){
      fun(n, open+1, close, sb.append(')'), res);
      sb.deleteCharAt(sb.length() - 1);
    }

    if(close < open){
      fun(n, open, close+1, sb.append('('), res);
      sb.deleteCharAt(sb.length() - 1);
    }
    
  }
}
