class Sudoko{
  public void solveSudoko(char[][] board){
    solve(board);
  }

  public boolean solve(char[][] board){
    for(int row = 0; row < board.length; row++){
      for(int col = 0; col < board.length; col++){

        if(board[row][col] == '.'){
          for(char ch = '1'; ch <= '9'; ch++){
            if(isPossible(board, row, col, ch)){
              board[row][col] = ch;
              if(fun(board) == true){
                return true;
              }
              board[row][col] = '.';
            }
          }
          return false;
        }
      }
    }
    return true;
  }

    public boolean isPossible(char[][] board, int row, int col, char ch){
      for (int j = 0; j < 9; j++) {
        if (board[row][j] == ch) {
          return false;
        }
      }

      for (int i = 0; i < 9; i++) {
        if (board[i][col] == ch) {
          return false;
        }
      }

      int startRow = row - row % 3;
      int startCol = col - col % 3;

      for (int i = startRow; i < startRow + 3; i++) {
        for (int j = startCol; j < startCol + 3; j++) {
          if (board[i][j] == ch) {
            return false;
          }
        }
      }

    return true; 
  }
}
