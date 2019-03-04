
public class Knight extends Piece{
	public Knight(int player) {
		super(player, "images2/Knight" + player + ".png");
	}
	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		
		if((b[to.getColumn()][to.getRow()] == null || b[to.getColumn()][to.getRow()].getPlayer() != getPlayer()) && 
			(to.getColumn()==from.getColumn()+2 && to.getRow()==from.getRow()+1) ||
			(to.getColumn()==from.getColumn()+2 && to.getRow()==from.getRow()-1) ||
			(to.getColumn()==from.getColumn()-2 && to.getRow()==from.getRow()+1) ||
			(to.getColumn()==from.getColumn()-2 && to.getRow()==from.getRow()-1) ||
			(to.getColumn()==from.getColumn()+1 && to.getRow()==from.getRow()+2) ||
			(to.getColumn()==from.getColumn()+1 && to.getRow()==from.getRow()-2) ||
			(to.getColumn()==from.getColumn()-1 && to.getRow()==from.getRow()+2) ||
			(to.getColumn()==from.getColumn()-1 && to.getRow()==from.getRow()-2))
			return true;
		else 
			return false;
		
	}
}
