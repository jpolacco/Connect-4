/**
 * Used to check a board state for wins.
 *
 * @author _________
 * @version _______
 */
public class CheckWin {
    // STEP 6: Fill in the class with the appropriate methods.

    private static boolean checkDiagonal(char[][] board, int r, int c){
        // Should check both diagonals for wins
        return false;
    }

    private static boolean checkRow(char[][] board, int r, int c){
        // Should check the row for a win
        return false;
    }

    private static boolean checkCol(char[][] board, int r, int c){
        // Should check the column for a win
        return false;
    }

    public static char checkWin(char[][] board, char playerChar, char AIChar, char emptyChar){
        // Combine the 3 methods above to check the board state. Be careful about out-of-bounds errors.
        // Note: unlike the other methods, this method returns a character (the side that won).

        return ' ';
    }
}
