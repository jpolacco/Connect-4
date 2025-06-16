public class Player {
    public String name = "";

    private char[][] board; // current board state
    private final int ROWS = 6;
    private final int COLS = 7;

    // STEP 1: Choose characters you like.
    public final char MY_TOKEN = ' ';
    public final char OPP_TOKEN = ' ';
    public final char EMPTY_TOKEN = ' ';
    
    public Player(){
        // Set up a blank board
        board = new char[ROWS][COLS];
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++)
                board[r][c] = EMPTY_TOKEN;
        }
    }

    // Method to be overriden
    public int returnMove(){
        return (int)(Math.random() * COLS);
    }


    // You can disregard anything down here
    // ================================================================================
    // ================================================================================
    
    // Updates board after move
    public void updateState(char[][] board){
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++)
                this.board[r][c] = board[r][c];
        }
    }
    
    // For debugging
    public void printBoard(){
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                System.out.print("[" + board[r][c] + "]");
            }
            System.out.println();
        }
    }
}