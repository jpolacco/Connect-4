import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Handles Connect 4 graphics
 *
 * @author _________
 * @version _______
 */
public class Connect4 extends JComponent implements MouseListener {
    // Constants
    private final int ROWS = 6;
    private final int COLS = 7;

    // Colors used for the tokens the player and AI uses
    private final Color PLAYER_COL = new Color(255, 0, 0);
    private final Color AI_COL = new Color(255, 255, 0);

    // Board representation
    // STEP 1: Choose characters to represent these three states (e.g. 'p' for player, 'a' for AI, ' ' for empty)
    private final char PLAYER_CHAR = ' ';
    private final char AI_CHAR = ' ';
    private final char EMPTY_CHAR = ' ';

    // Size of the squares that tokens are dropped into, in pixels.
    private final int SQUARE_SIZE = 80;
    public char board[][];

    // AI opponent
    private final int MOVES_IN_ADVANCE = 5;
    private Connect4AI opponent;

    /**
     * A constructor to initialize the board and opponent AI.
     */
    public Connect4(){
        // STEP 2: Initialize every element in your board as "empty."


        // Create new instance of Connect4AI
        opponent = new Connect4AI(MOVES_IN_ADVANCE, PLAYER_CHAR, AI_CHAR);
        
        // Add the mouse listener
        addMouseListener(this);
    }

    /**
     * Drops a token at a specified column
     * @param col - The column specified
     */
    private void playMove(int col){
        // STEP 4: Fill in the playMove method.
    }

    /**
     * Everything meant to be painted on the window should go here.
     */
    @Override
    public void paintComponent(Graphics g){
        // Display the board here.
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                // STEP 3: Correctly display the contents of the board.
                //         If the character matches PLAYER_CHAR, it should be colored PLAYER_COL.
                //         Similarly, if the character matches AI_CHAR, it should be colored AI_COL.

                g.setColor(Color.GRAY);
                g.fillOval(j*SQUARE_SIZE, 80 + i*SQUARE_SIZE, SQUARE_SIZE - 8, SQUARE_SIZE - 8);
            }
        }
    }

    /**
     * Handles mouse clicks
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // STEP 5: When the user clicks a column, their token should be dropped down to that column.
        //         This can be handled with if/else-if/else statements, but other methods can be used as well.

        // REPLACE THIS WITH YOUR CODE
        System.out.println("You clicked (" + e.getX() + ", " + e.getY() + ")");

        // Redraws the screen
        repaint();
    }

    // Ignore these, they aren't important.
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
