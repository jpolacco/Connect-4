/**
 * The AI used as the opponent in Connect 4. 
 *
 * @author Gene Yang (edited by Joe Polacco)
 * @version June 19, 2025
 */
public class Player {
    private char[][] board; // current board state
    private final int ROWS = 6;
    private final int COLS = 7;

    public char MY_TOKEN = '@';
    public char OPP_TOKEN = '!';
    public char EMPTY_TOKEN = ' ';
    
    public Player(){
        // Setup board
        board = new char[ROWS][COLS];
    }

    // TODO: return your name
    public String getName(){
        return "";
    }

    /** TODO: the most important method you will write
     *  (you will write and utilize other helper methods)
     *  @return the column where the bot will make it's next move
     *  it should first: 1. check for obvious wins by your bot and play that move
     *  and then:        2. if no obvious winning move by your bot, block obvious wins by the human player
     *  else:            3. play anywhere you want
     */
    public int returnMove(){
        return -1; 
    }


    // You can disregard anything down here : printBoard() is very useful for debugging!
    // ================================================================================
    // ================================================================================
    
    // Updates board after move
    public void updateState(char[][] board, char my_token, char opp_token, char empty_token){
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++)
                this.board[r][c] = board[r][c];
        }

        MY_TOKEN = my_token;
        OPP_TOKEN = opp_token;
        EMPTY_TOKEN = empty_token;
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
