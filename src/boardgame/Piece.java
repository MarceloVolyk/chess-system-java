package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //pe�a rec�m criada n�o tem posi��o definida ainda
	}

	protected Board getBoard() {
		return board;
	}


	
	
}
