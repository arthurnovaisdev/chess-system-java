package com.arthurnovaisdev.app;

import com.arthurnovaisdev.boardgame.Board;
import com.arthurnovaisdev.boardgame.Position;
import com.arthurnovaisdev.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {

        ChessMatch match = new ChessMatch();
        UI.printBoard(match.getPieces());
    }
}
