
public class Knight extends Piece{
	public Knight(int player) {
		super(player, "images2/Knight" + player + ".png");
	}
	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		if(b[to.getColumn()][to.getRow()] != null && b[to.getColumn()][to.getRow()].getPlayer() != getPlayer()) {
			return true;
		}
		else if(b[to.getColumn()][to.getRow()] == null) {
			return true;
		}
		else {
			return false;
		}
	}
}
