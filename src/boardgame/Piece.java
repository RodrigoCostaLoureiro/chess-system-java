package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece() {
	}
	
	public Piece(Board board) {
		this.board = board;
		position = null; // o Java j� faz isso por padr�o
	}
	
	protected Board getBoard() {
		return board;
	}
}
