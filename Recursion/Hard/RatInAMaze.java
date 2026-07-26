class MazeSolver{

  ArrayList<String> res = new ArrayList<>();
  
  public ArrayList<String> ratInMaze(int[][] maze){
    if(maze[0][0] == 0){
      return res;
    }

    int n = maze.length;

    StringBuilder sb = new StringBuilder();
    boolean[][] visited = new boolean[n][n];

    fun(maze, 0, 0, sb, visited);
    return res;
  }

  public void fun(int[][] maze, int row, int col, StringBuilder sb, boolean[][] visited){
    if(row == maze.length - 1 && col == maze.length - 1){
      res.add(sb.toString());
      return;
    }

    visited[row][col] = true;

    int n = maze.length;

    if(row < n - 1 && isPossible(row + 1, col, visited, maze)){
      sb.append("D");
      fun(maze, row + 1, col, sb, visited);
      sb.deleteCharAt(sb.length() - 1);
    }

    if(col > 0 && isPossible(row, col - 1, visited, maze)){
      sb.append("L");
      fun(maze, row, col - 1, sb, visited);
      sb.deleteCharAt(sb.length() - 1);
    }

    if(col < n - 1 && isPossible(row, col + 1, visited, maze)){
      sb.append("R");
      fun(maze, row, col + 1, sb, visited);
      sb.deleteCharAt(sb.length() - 1);
    }

    if(row > 0 && isPossible(row - 1, col, visited, maze)){
      sb.append("U");
      fun(maze, row - 1, col, sb, visited);
      sb.deleteCharAt(sb.length() - 1);
    }

    visited[row][col] = false;
  }
  

  public boolean isPossible(int row, int col, boolean[][] visited, int[][] maze){
    if(maze[row][col] == 1 && visited[row][col] == false){
      return true;
    }

    return false;
  }
}
