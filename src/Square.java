import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;
    private Color color;
    private static final int sWidth = 125;
    private static final int sLength = 125;
    private Image imageX;
    private Image imageO;



    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col,Image imageX, Image imageO) {
        this.row = row;
        this.col = col;

        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
        this.imageX = imageX;
        this.imageO = imageO;


    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }
    public void draw(Graphics g)
    {
        if(isWinningSquare)
        {
            Font wrtng1 = new Font("Times New Roman", Font.BOLD, 75);
            g.setColor(Color.green);
            g.fillRect(100 + 125 * col,150 + 125 * row, sWidth,sLength);

            if(marker.equals("X"))
            {
                g.setColor(Color.BLACK);
                g.setFont(wrtng1);
                g.drawString("X Wins!",150,600);
            }
            else if(marker.equals("O"))
            {
                g.setColor(Color.BLACK);
                g.setFont(wrtng1);
                g.drawString("O Wins!",150,600);
            }
        }
        //view
        //x image
        //O image
        //(x,y)

        g.setColor(Color.BLACK);
        g.drawRect(100 + 125 * row,150 + 125 * col, sWidth,sLength);

        if(marker.equals("X"))
        {
           g.drawImage(imageX, 100 + 125 * col,150 + 125 * row, 125, 125, null);


        }
        else if(marker.equals("O"))
        {
            g.drawImage(imageO, 100 + 125 * col,150 + 125 * row, 125, 125, null);
        }



    }

}
