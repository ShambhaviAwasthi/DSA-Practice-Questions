class Solution {
    private static final char MINE = 'M';
    private static final char EMPTY = 'E';
    private static final char DISCOVERED_MINE = 'X';
    private static final char DISCOVERED_EMPTY = 'B';

    
    public char[][] updateBoard(char[][] board, int[] click) {
        int y = click[0];
        int x = click[1];
        if (board[y][x] == MINE) {
            board[y][x] = DISCOVERED_MINE;
            return board;
        } else {
            discover(board, x, y);
        }
        return board;
    }
    
    private void discover(char[][] board, int x, int y) {
        int nbMines = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (!isInBounds(board, x + j, y + i)) continue;
                if (board[y + i][x + j] == MINE) {
                    nbMines++;
                }
            }
        }
        if (nbMines == 0) {
            board[y][x] = DISCOVERED_EMPTY;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (!isInBounds(board, x + j, y + i)) continue;
                    if (i == 0 && j == 0) continue;
                    if (board[y + i][x + j] != DISCOVERED_EMPTY && board[y + i][x + j] != MINE) {
                        discover(board, x + j, y + i);
                    }
                }
            }
        } else {
            board[y][x] = Character.forDigit(nbMines, 10);
        }
    }
    
    private boolean isInBounds(char[][] board, int x, int y) {
        return y >= 0 && y < board.length && x >= 0 && x < board[y].length;
    }
}
