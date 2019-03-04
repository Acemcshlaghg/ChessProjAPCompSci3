
public class Rook extends Piece {

	public Rook(int player) {
		super(player, "images2/Rook" + player + ".png");
	}

	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		if (b[to.getColumn()][to.getRow()] != null && b[to.getColumn()][to.getRow()].getPlayer() == getPlayer())
			return false;
		// moving vertically-down
		if (to.getRow() == from.getRow() && to.getColumn() > from.getColumn()) {
			for (int i = from.getColumn() + 1; i < to.getColumn(); i++)
				if (b[i][to.getRow()] != null)
					return false;
		}
		// moving vertically-up
		else if (to.getRow() == from.getRow() && to.getColumn() < from.getColumn()) {
			for (int i = from.getColumn()-1; i > to.getColumn(); i--)
				if (b[i][to.getRow()] != null)
					return false;
		}
		// moving horizontally-left
		else if (to.getColumn() == from.getColumn() && to.getRow() < from.getRow()) {
			for (int i = from.getRow() - 1; i > to.getRow(); i--)
				if (b[to.getColumn()][i] != null)
					return false;
		}
		// moving horizontally-Right

		else if (to.getColumn() == from.getColumn() && to.getRow() > from.getRow()) {
			for (int i = from.getRow() + 1; i < to.getRow(); i++)
				if (b[to.getColumn()][i] != null)
					return false;
		}

		else if (b[to.getColumn()][to.getRow()] != null
				&& b[to.getColumn()][to.getRow()].getPlayer() == getPlayer()) {
			return false;
		} else if (b[to.getColumn()][to.getRow()] != null
				&& b[to.getColumn()][to.getRow()].getPlayer() != getPlayer()) {
			return false;
		} else if (b[to.getColumn()][to.getRow()] == null) {
			return true;
		}
	
			return true;
	}

}
