package Connect4GUI;

import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class GameHandler {
	
	public GridPane gameboard;
	public int [][] solutionArray = new int [6][7];	
	
	public GameHandler(GridPane gameboard) {
		this.gameboard = gameboard;
		
	}
	
	@SuppressWarnings({ "static-access" })
	public boolean placeChip(int col, String filename) {
		ImageView tempChip = new ImageView("file:./images/" + filename);
		tempChip.setId(filename);
		Node deadCell = lastEmptyCell(col);
		if (deadCell == null){
			return false;
		}
		int row = gameboard.getRowIndex(deadCell);
		gameboard.getChildren().remove(deadCell);
		gameboard.add(tempChip, col, row);
		System.out.println("row = " + row + " col = " + col);
		if (filename.equals("player1.jpg")){
			solutionArray[row][col] = 1;
		}
		else if (filename.equals("player2.jpg")) {
			solutionArray[row][col] = 2;
		}
		return true;
	}
	
	public boolean isSolution (int player) {
		int count = 0;
		
		
		for (int i = 0; i < 6; i++){
			for(int j = 0; j < 7; j++) {
				if(solutionArray [i][j] == player) {
					
					count++;
					
				}
				else {
					count = 0;
				}
				if(count == 4) {
					return true;
				}
				
			}
		}
		
		count = 0;
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 6; j++) {
				if(solutionArray[j] [i] == player) {
					count++;
					System.out.println("col count:" + count);
				}
				else {
					count = 0;
				}
				if(count == 4) {
					return true;
				}
			}
				count = 0;
		}
		return false;
	}
	

	@SuppressWarnings("static-access")
	public Node lastEmptyCell(int col) {
		Node node = null;
		for (Node cell : gameboard.getChildren()) {
			if(gameboard.getColumnIndex(cell) == col) {
				if (cell.getId()!=("empty")) {
					return node;
				}
				else {
					node = cell;
				}
			}
		}
		return node;
	}
}
