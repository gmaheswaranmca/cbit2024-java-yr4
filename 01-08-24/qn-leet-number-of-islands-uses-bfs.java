class Cell {
    public int row;
    public int col;
    public Cell(int row, int col) { this.row = row; this.col = col; }
    @Override
    public boolean equals(Object obj) {
      Cell another = (Cell)obj;
      return this.row == another.row && this.col == another.col;
    }
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.col;
        return hash;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        Set<Cell> visited = new HashSet<Cell>();
        
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for(int r = 0; r < m; r++) {
            for(int c = 0; c < n; c++) {
                if(grid[r][c] == '1' && (!visited.contains(new Cell(r,c)))) {
                    count++;                    
                    bfs(grid,r,c,m,n,visited);
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int r, int c, int m, int n, Set<Cell> visited) {
        List<Cell> directionOffsets = new ArrayList<Cell>();
        directionOffsets.add(new Cell(0,1)); //right
        directionOffsets.add(new Cell(0,-1)); //left
        directionOffsets.add(new Cell(1,0)); //down
        directionOffsets.add(new Cell(-1,0)); //up
        
        Queue<Cell> queue = new LinkedList<Cell>();
        queue.add(new Cell(r,c));
        visited.add(new Cell(r,c));

        while(!queue.isEmpty()) {
            Cell queueCell = queue.poll();
            //travel in the directions 
            for(Cell cellOffset : directionOffsets) {
                Cell neighbourCell = new Cell(queueCell.row + cellOffset.row, 
                                             queueCell.col + cellOffset.col);
                if(neighbourCell.row >= 0 && neighbourCell.row < m &&
                  neighbourCell.col >= 0 && neighbourCell.col < n && 
                  grid[neighbourCell.row][neighbourCell.col] == '1' && 
                  (!visited.contains(neighbourCell))) { 
                    queue.add(neighbourCell);
                    visited.add(neighbourCell);
                  }
            }
        }
    }
}