import javax.swing.*;

import versions.basic_intelligence;

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
    private char PLAYER_CHAR;
    private char AI_CHAR;
    private char EMPTY_CHAR;

    // Size of the squares that tokens are dropped into, in pixels.
    private final int SQUARE_SIZE = 80;
    public char board[][];

    // AI opponent
    private basic_intelligence opponent;

    // Game over?
    private boolean game_over = false;

    /**
     * A constructor to initialize the board and opponent AI.
     */
    public Connect4(){
        // Create new instance of Connect4AI
        opponent = new basic_intelligence();
        PLAYER_CHAR = opponent.OPP_TOKEN;
        AI_CHAR = opponent.MY_TOKEN;
        EMPTY_CHAR = opponent.EMPTY_TOKEN;

        board = new char[ROWS][COLS];
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                board[r][c] = EMPTY_CHAR;
            }
        }

        // Add the mouse listener
        addMouseListener(this);
    }

    // To be used next time
    public void mm(int col,char what_char){if(board[0][col]!=EMPTY_CHAR){System.out.println("Attempted to drop token in a full column");return;}int r=0;for(;r<ROWS;r++){if(board[r][col]!=EMPTY_CHAR)break;}board[r-1][col]=what_char;if(cw()==what_char){game_over=true;System.out.println("Game over - "+(what_char==AI_CHAR?"program":"you")+" won.");}if(cd()){game_over=true;System.out.println("Game over - draw.");}}private char cw(){for(int r=0;r<ROWS;r++){for(int c=0;c<COLS;c++){if(board[r][c]==EMPTY_CHAR)continue;if(c+3<COLS&&board[r][c]==board[r][c+1]&&board[r][c]==board[r][c+2]&&board[r][c]==board[r][c+3])return board[r][c];if(r+3<ROWS&&board[r][c]==board[r+1][c]&&board[r][c]==board[r+2][c]&&board[r][c]==board[r+3][c])return board[r][c];if(r+3<ROWS&&c+3<COLS&&board[r][c]==board[r+1][c+1]&&board[r][c]==board[r+2][c+2]&&board[r][c]==board[r+3][c+3])return board[r][c];if(r+3<ROWS&&c-3>=0&&board[r][c]==board[r+1][c-1]&&board[r][c]==board[r+2][c-2]&&board[r][c]==board[r+3][c-3])return board[r][c];}}return EMPTY_CHAR;}private boolean cd(){boolean draw=true;for(int c=0;c<COLS;c++){if(board[0][c]==EMPTY_CHAR)draw=false;}return draw;}


    /**
     * Everything meant to be painted on the window should go here.
     */
    @Override
    public void paintComponent(Graphics g){
        // Display the board here.
        for(int r = 0; r < ROWS; r++){
            for(int c = 0; c < COLS; c++){
                if(board[r][c] == PLAYER_CHAR) g.setColor(PLAYER_COL);
                else if(board[r][c] == AI_CHAR) g.setColor(AI_COL);
                else g.setColor(Color.GRAY);

                g.fillOval(c*SQUARE_SIZE, 80 + r*SQUARE_SIZE, SQUARE_SIZE - 8, SQUARE_SIZE - 8);
            }
        }
    }

    /**
     * Handles mouse clicks
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if(game_over)
            return;


        int col = e.getX()/SQUARE_SIZE;
        if(col < 0 || col >= COLS) return;
        
        mm(col, PLAYER_CHAR);
        repaint();

        if(game_over) return;

        // ====================================
        
        opponent.updateState(board);
        int choice = opponent.returnMove();
        mm(choice, AI_CHAR);

        // Redraws the screen
        repaint();
    }

    // Ignore these, they aren't important.
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
