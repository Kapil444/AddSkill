class Solution {
    public boolean isValidSudoku(char[][] board) {
         boolean[][] row = new boolean[9][10];
        boolean[][] col = new boolean[9][10];
        boolean[][] are = new boolean[9][10];
       
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                
                if(board[i][j]=='.')continue;
                
                int x = board[i][j] - '0';
                if(row[i][x])return false;
                
                row[i][x]=true;
                if(col[j][x])return false;
                
                col[j][x]=true;
                
                if(are[i-i%3+j/3][x])return false;
                are[i-i%3+j/3][x]=true;
            }
        }
                
        return true;
    }
}
