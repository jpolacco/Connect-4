/**
 * The AI used as the opponent in Connect 4. Uses minimax search to find moves.
 *
 * @author _________
 * @version _______
 */
public class Connect4AI {
    // Depth of minimax search
    private int movesInAdvance;
    private char playerChar;
    private char AIChar;

    /**
     * Constructor
     * @param movesInAdvance - how many moves in advance to search
     * @param playerChar - character that represents the player on the board
     * @param AIChar - character that represents the AI on the board
     */
    public Connect4AI(int movesInAdvance, char playerChar, char AIChar){
        this.movesInAdvance = movesInAdvance;
        this.playerChar = playerChar;
        this.AIChar = AIChar;
    }

    /**
     * Minimax search
     * Based off the Wikipedia page at https://en.wikipedia.org/wiki/Minimax#Pseudocode
     * @param board - Board representation
     * @param depth - Current depth of the search
     * @param maximizingPlayer - True if we're considering the AI's turn, false if it's the player's turn
     * @return the value of the search
     */
    private int minimax(char[][] board, int depth, boolean maximizingPlayer){
        // STEP 7: Implement minimax search based on board state.


        // If the game is over, return +100 if the AI won and -100 if the player won.
        // If the depth is zero and the game is not over, return 0 (neutral).

        if(maximizingPlayer){
            int val = -100000;

            // First, create a deep copy of the board (boardCopy)

            // For all columns in the board, try dropping a token in that column.
            for(int i = 0; i < board[0].length; i++){
                // Make the move in boardCopy (NOT in board directly)
                // Search with minimax
                // Undo the move in boardCopy (just set it as empty)
            }

            return val;

        } else {
            int val = 100000;

            // First, create a deep copy of the board (boardCopy)

            // For all columns in the board, try dropping a token in that column.
            for(int i = 0; i < board[0].length; i++){
                // Make the move in boardCopy (NOT in board directly)
                // Search with minimax
                // Undo the move in boardCopy (just set it as empty)
            }

            return val;
        }
    }
}
