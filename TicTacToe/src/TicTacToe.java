import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class TicTacToe extends JFrame {
	private boolean turn = true;
	private Icon xIcon = new ImageIcon(TicTacToe.class.getResource("/resources/x.png"));
	private Icon oIcon = new ImageIcon(TicTacToe.class.getResource("/resources/o.png"));
	private Icon blankIcon = new ImageIcon(TicTacToe.class.getResource("/resources/blank.png"));
	private List<JButton> squares = new ArrayList<>();
	
	public TicTacToe() {
		setLayout(new GridLayout(3, 3));
		
		for (int i = 1; i <= 9; i++) {
			JButton square = new JButton();
			square.setIcon(blankIcon);
			square.setBorder(new LineBorder(Color.black));
			squares.add(square);
			add(square);
			square.addActionListener(new SquareActionListener(i, square));
		}
		
		pack();
	}
	
	public static void main(String[] args) {
		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.setVisible(true);
		ticTacToe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		ticTacToe.setSize(new Dimension(600, 600));
	}
	
	private void atEndOfTurn()
	{
		for (int row = 0; row < 3; row++) {
			JButton square1 = squares.get(row * 3);
			JButton square2 = squares.get(row * 3 + 1);
			JButton square3 = squares.get(row * 3 + 2);
							
			if (square1.getIcon() == xIcon && square2.getIcon() == xIcon && square3.getIcon() == xIcon) {
				onGameOver(GameOverCondition.X_WON);
				return;
			} else if (square1.getIcon() == oIcon && square2.getIcon() == oIcon && square3.getIcon() == oIcon) {
				onGameOver(GameOverCondition.O_WON);
				return;
			}
		}
		
		for(int col = 0; col < 3; col++) {
			JButton square1 = squares.get(col);
			JButton square2 = squares.get(col + 3);
			JButton square3 = squares.get(col + 6);
			
			// col = 0 (left column) [0, 3, 6]
			// col = 1 (middle) [1, 4, 7]
			// col = 2 [2, 5, 8]
			
			if (square1.getIcon() == xIcon && square2.getIcon() == xIcon && square3.getIcon() == xIcon) {
				onGameOver(GameOverCondition.X_WON);
				return;
			} else if (square1.getIcon() == oIcon && square2.getIcon() == oIcon && square3.getIcon() == oIcon) {
				onGameOver(GameOverCondition.O_WON);
				return;
			}
		}
		
		JButton square1 = squares.get(0);
		JButton square2 = squares.get(4);
		JButton square3 = squares.get(8);
		
		if (square1.getIcon() == xIcon && square2.getIcon() == xIcon && square3.getIcon() == xIcon) {
			onGameOver(GameOverCondition.X_WON);
			return;
		} else if (square1.getIcon() == oIcon && square2.getIcon() == oIcon && square3.getIcon() == oIcon) {
			onGameOver(GameOverCondition.O_WON);
			return;
		}
		
		JButton square4 = squares.get(2);
		JButton square5 = squares.get(4);
		JButton square6 = squares.get(6);
		// top-left to bottom-right [0,4,8]
		// top-right to bottom-left [2,4,6]
		
		if (square4.getIcon() == xIcon && square5.getIcon() == xIcon && square6.getIcon() == xIcon) {
			onGameOver(GameOverCondition.X_WON);
			return;
		} else if (square4.getIcon() == oIcon && square5.getIcon() == oIcon && square6.getIcon() == oIcon) {
			onGameOver(GameOverCondition.O_WON);
			return;
		}
		
		boolean isBlankSquare = false;
		
		for (int i = 1; i <= 9; i++)
		{
			if (squares.get(i - 1).getIcon() == blankIcon)
			{
				isBlankSquare = true;
				break;
			}
		}
		
		if (!isBlankSquare) {
			onGameOver(GameOverCondition.DRAW);
			return;
		}
		
		turn = !turn;
	}
	
	private void onGameOver(GameOverCondition gameOverCondition) {
		String message;
		
		switch (gameOverCondition)
		{
		case DRAW:
			message = "It's a draw!";
			break;
		case O_WON:
			message = "O Won!";
			break;
		case X_WON:
			message = "X Won!";
			break;
		default:
			return;
		}
		
		JOptionPane.showMessageDialog(this, message);
		
		for(int b = 0; b < 9; b++) {
			squares.get(b).setIcon(blankIcon);
		}
		
		turn = true;
	}
	
	private class SquareActionListener implements ActionListener {
		private int squareNumber;
		private JButton button;
		
		public SquareActionListener(int squareNumber, JButton button) {
			this.squareNumber = squareNumber;
			this.button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button " + squareNumber + " clicked!");
			
			if (button.getIcon() != blankIcon) {
				return;
			}
			
			if (turn) {
				button.setIcon(xIcon);
			} else {
				button.setIcon(oIcon);
			}
			
			atEndOfTurn();
		}
		
	}
}
