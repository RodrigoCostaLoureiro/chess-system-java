package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece() {
	}
	
	public Piece(Board board) {
		this.board = board;
		position = null; // o Java já faz isso por padrão
	}
	
	protected Board getBoard() {
		return board;
	}
}
