package app;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {


		ChessMatch match = new ChessMatch();
		UI.printBoard(match.getPieces());
	}

}
