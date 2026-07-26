class Nqueen{

  List<List<String>> res = new ArrayList<>();
  
  public List<List<String>> solveNQueens(int n){
    char[][] board = new char[n][n];

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        board[i][j] = '.';
      }
    }

    fun(n, 0, board);

    return res;
    
  }

  public void fun(int n, int row, char[][] board){
    if(row == n){
      res.add(print(board));
      return;
    }

    for(int j = 0; j < n; j++){
      if(isSafe(row, j, board)){
        board[row][j] = 'Q';
        fun(n, row+1, board);
        board[row][j] = '.';
      }
    }
  }

  public boolean isSafe(int row, int col, char[][] board){
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q'){
        return false;
      }
    }

    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q'){
        return false;
      }
    }

    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q'){
        return false;
      }
    }

    return true;
  }

  public List<String> print(char[][] board){
    List<String> ans = new ArrayList<>();

    for(int i = 0; i < board.length; i++){
      ans.add(new String(board[i]));
    }

    return ans;
  }
}
