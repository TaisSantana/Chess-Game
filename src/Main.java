import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jogo de Xadrez!");
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}