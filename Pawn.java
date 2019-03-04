//Class: Chess
//Written By: Jack Shapiro
//Date: 2/26/19
//description: This class extends piece and contains the restrictions of the pawn's moves.

public class Pawn extends Piece{

	public Pawn(int player) {
		super(player, "images2/Pawn" + player+ ".png");
	}


	public boolean isValidMove(Location from, Location to, Piece[][]b){

		
		//white team
			if((getPlayer() == 1 && 
				(to.getColumn() < from.getColumn()) &&
				// moving forward general		
				(to.getRow() == from.getRow() && to.getColumn() == from.getColumn() - 1 && b[to.getRow()][to.getColumn()] == null) ||
				// moving forward 2 on first move
				(from.getColumn() == 6 && to.getRow() == from.getRow() && to.getColumn() == from.getColumn() - 2 && b[to.getRow()][to.getColumn()] == null) ||
				// kill to the right								// makes sure you actually want to kill that piece		
				(b[from.getRow() + 1][from.getColumn() - 1] != null && b[from.getRow() + 1][from.getColumn() - 1].getPlayer() == 1 && to.getRow() == from.getRow() + 1 && to.getColumn() == from.getColumn() - 1 ) || 
				// kill to the left								// makes sure you actually want to kill that piece
				(b[from.getRow() - 1][from.getColumn() - 1] != null && b[from.getRow() - 1][from.getColumn() - 1].getPlayer() == 1 && (to.getRow() == from.getRow() - 1 && to.getColumn() == from.getColumn() - 1) )) ||		
		//black team
				(getPlayer() == 2 &&
				(to.getColumn() > from.getColumn()) &&
				// moving forward general		
				(to.getRow() == from.getRow() && to.getColumn() == from.getColumn() + 1 && b[to.getRow()][to.getColumn()] == null) ||
				// moving forward 2 on first move
				(from.getColumn() == 1 && to.getRow() == from.getRow() && to.getColumn() == from.getColumn() + 2 && b[to.getRow()][to.getColumn()] == null) ||
				// kill to the right								// makes sure you actually want to kill that piece		
				(from.getRow()-1 != -1 && from.getRow() + 1 != 8 && b[from.getRow() + 1][from.getColumn() + 1] != null && b[from.getRow() + 1][from.getColumn() + 1].getPlayer() == 2 && to.getRow() == from.getRow() + 1 && to.getColumn() == from.getColumn() + 1 ) || 
				// kill to the left								// makes sure you actually want to kill that piece
				(from.getRow()-1 != -1 && from.getRow() + 1 != 8 && b[from.getRow() - 1][from.getColumn() + 1] != null && b[from.getRow() - 1][from.getColumn() + 1].getPlayer() == 2 && (to.getRow() == from.getRow() - 1 && to.getColumn() == from.getColumn() + 1) )		
				)) {
			return true;
		}

		return false;

	}



}
