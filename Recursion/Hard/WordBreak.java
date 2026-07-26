class WordBreak{
  public boolean wordBreak(String s, List<String> wordDict){
    StringBuilder sb = new StringBuilder();

    return fun(s, wordDict, sb);
  }

  public boolean fun(String s, List<String> wordDict, StringBuilder sb){
    if(sb.toString().equals(s)){
      return true;
    }

    if(sb.length() > s.length()){
      return false;
    }

    for(String ele : wordDict){
      sb.append(ele);
      if(fun(s, wordDict, sb) == true){
        return true;
      }
      int len = ele.length();
      sb.delete(sb.length() - len, sb.length());
    }
    return false;
  }
}
