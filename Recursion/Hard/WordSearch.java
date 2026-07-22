class WordSearch{
  int m;
  int n;
  public boolean exist(char[][] board, String word){

    int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    m = board.length;
    n = board[0].length;
    
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(fun(board, word, 0, i, j, dir)){
          return true;
        }
      }
    }

    return false;
  }

  public boolean fun(char[][] board, String word, int i, int row, int col, int[][] dir){
    if(i == word.length()){
      return true;
    }

    if(row < 0 || col < 0 || row >= m || col >= n || board[row][col] == '$'){
      return false;
    }

    if(board[row][col] != word.charAt(i)){
      return false;
    }

    char temp = board[row][col];
    board[row][col] = '$';

    for(int[] ele : dir){
      int new_row = row + ele[0];
      int new_col = col + ele[1];
      if(fun(board, word, i+1, new_row, new_col, dir)){
        return true;
      }
    }

    board[row][col] = temp;

    return false;
  }
}
