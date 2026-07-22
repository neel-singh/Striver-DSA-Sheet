class Combination{

  List<String> res = new ArrayList<>();
  
  public List<String> letterCombinations(String digits){
    HashMap<Integer, String> map = new HashMap<>();

    map.put(2, "abc");
    map.put(3, "def");
    map.put(4, "ghi");
    map.put(5, "jkl");
    map.put(6, "mno");
    map.put(7, "pqrs");
    map.put(8, "tuv");
    map.put(9, "wxyz");

    StringBuilder sb = new StringBuilder();

    fun(digits, 0, sb, map);

    return res;
  }
  
  public void fun(String digits, int i, StringBuilder sb, HashMap<Integer, String> map){
    if(i == digits.length()){
      res.add(sb.toString());
      return;
    }

    int key = digits.charAt(i) - '0';
    String s = map.get(key);

    for(int j = 0; j < s.length(); j++){
      sb.append(s.charAt(j));
      fun(digits, i+1, sb, map);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}
