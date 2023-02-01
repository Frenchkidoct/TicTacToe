import java.awt.*;
import javax.swing.*;

public class TicTacToeViewer extends JFrame{
    // TODO: Complete this class
    private Image imageX;
    private Image imageO;
    private TicTacToeViewer window;
    private static final int MAX_WIDTH = 600;
    private static final int MAX_HEIGHT = 700;
    private static final int MAX_WINDOWHEIGHT = 700;
    private static final int MAX_WINDOWWIDTH = 600;

    private Square[][] board;
    public TicTacToeViewer(Square[][] board)
    {
        imageX = new ImageIcon("Resources/X.png").getImage();
        imageO = new ImageIcon("Resources/O.png").getImage();
        this.board = board;
        this.setTitle("TICTACTOE!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(MAX_WINDOWWIDTH, MAX_WINDOWHEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                board[i][j].draw(g);
                //if win draw square as green

            }
        }
    }
}
