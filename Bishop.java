
public class Bishop extends Piece {
	
	  public Bishop(int player){
			super(player, "images2/Bishop" + player +".png");
		}
	  
	public boolean isValidMove(Location from, Location to, Piece[][] b) {
		if(Math.abs(from.getColumn()-to.getColumn())!= Math.abs(from.getRow()-to.getRow()) || (b[to.getColumn()][to.getRow()]!=null &&b[to.getColumn()][to.getRow()].getPlayer()==getPlayer()))
				return false;
		
		
			return true;
		
	}
}
