public class MoveMaker {
    /**
     * Whether we can drop a token at a specified column
     * @param board - The board
     * @param col - The column specified
     * @return - False if the column is full, true otherwise
     */
    public static boolean canMakeMove(char[][] board, int col){
        return false;
    }

    /**
     * Drops a token at a specified column
     * @param board - The board
     * @param col - The column specified
     * @param toPlace - Char of the side we're playing for
     */
    public static void makeMove(char[][] board, int col, char toPlace){}

    /**
     * Removes the most recent token at a specified column (effectively undoing a move)
     * @param board - The board
     * @param col - The column specified
     */
    public static void undoMove(char[][] board, int col){}
}
