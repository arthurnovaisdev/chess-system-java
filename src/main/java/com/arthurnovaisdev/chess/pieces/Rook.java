package com.arthurnovaisdev.chess.pieces;

import com.arthurnovaisdev.boardgame.Board;
import com.arthurnovaisdev.chess.ChessPiece;
import com.arthurnovaisdev.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
