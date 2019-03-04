//Class: Chess
//Written By: Jack Shapiro
//Date: 2/26/19
//description: This class extends piece and contains the restrictions of the pawn's moves.

public class Pawn extends Piece {

	public Pawn(int player) {
		super(player, "images2/Pawn" + player + ".png");
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {


		if ((getPlayer() == 1 && 

				// white team
				// moving forward 1 on first move
				((from.getColumn() == 6 && to.getRow() == from.getRow() && to.getColumn() == from.getColumn() - 1
						&& b[to.getColumn()][to.getRow()] == null)
				|| 
				// moving forward 1 on first move
				(from.getColumn() == 6 && to.getRow() == from.getRow() && to.getColumn() == from.getColumn() - 2
						&& b[to.getColumn()][to.getRow()] == null)
				||
				// kill to the right // makes sure you actually want to kill that piece
				((to.getRow() == from.getRow() + 1 && to.getColumn() == from.getColumn() - 1) && from.getRow() <= 6
						&& b[to.getColumn()][to.getRow()] != null && b[to.getColumn()][to.getRow()].getPlayer() != getPlayer())
				||
				// kill to the left // checking if it is opposing piece
				((to.getRow() == from.getRow() - 1 && to.getColumn() == from.getColumn() - 1) && from.getRow() >= 1
						&& b[to.getColumn()][to.getRow()] != null && b[to.getColumn()][to.getRow()].getPlayer() != getPlayer())
				||
				// moving forward general
				(to.getRow() == from.getRow() && to.getColumn() == from.getColumn() - 1
						&& b[to.getColumn()][to.getRow()] == null)))
				||
				//black team
				(getPlayer() == 2 &&
				// moving forward general
				((to.getRow() == from.getRow() && to.getColumn() == from.getColumn() + 1
						&& b[to.getRow()][to.getColumn()] == null)
				||
				// moving forward 2 on first move
				(from.getColumn() == 1 && to.getRow() == from.getRow() && to.getColumn() == from.getColumn() + 2
						&& b[to.getColumn()][to.getRow()] == null)
				||
				// "catch and kill" to the right // makes sure you actually want to kill that
				// piece
				(from.getRow() <= 6 && b[to.getColumn()][to.getRow()] != null
						&& b[to.getColumn()][to.getRow()].getPlayer() == 1 && to.getRow() == from.getRow() + 1
						&& to.getColumn() == from.getColumn() + 1)
				||
				// "catch and kill" to the left // makes sure you actually want to kill that
				// piece
				(from.getRow() >= 1 && b[from.getColumn() + 1][from.getRow() - 1] != null
						&& b[from.getColumn() + 1][from.getRow() - 1].getPlayer() == 1
						&& (to.getRow() == from.getRow() - 1 && to.getColumn() == from.getColumn() + 1))))) 
			return true;
		 else 
			return false;
		
	}

}
