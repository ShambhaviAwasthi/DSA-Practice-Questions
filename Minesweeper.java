class Solution {
    public int getMines(char[][]board,int x,int y){
        int n=0;
        for(int i=x-1;i<=x+1;i++){
                for(int j=y-1;j<=y+1;j++){
                    if(i>=0 && i<board.length && j>=0 && j<board[0].length && board[i][j]=='M')
                        n++;
                }
            }
        return n;
    }
    public char[][] updateBoard(char[][] board, int[] click) {
        int x=click[0];
        int y=click[1];
        if(board[x][y]=='M')
            board[x][y]='X';
        else{
            int num= getMines(board, x,y);
            if(num!=0)
                board[x][y]=Character.forDigit(num,10);
            else{
                board[x][y]='B';
                for(int i=x-1;i<=x+1;i++){
                for(int j=y-1;j<=y+1;j++){
                    int []nclick=new int[2];
                    nclick[0]=i;
                    nclick[1]=j;
                    if(i>=0 && i<board.length && j>=0 && j<board[0].length && board[i][j]!='B')
                        updateBoard(board,nclick);
                    }
                }
            }
        }
            return board;    
    }
}
