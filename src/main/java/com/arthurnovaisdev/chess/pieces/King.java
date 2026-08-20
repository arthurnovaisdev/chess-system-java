package com.arthurnovaisdev.chess.pieces;

import com.arthurnovaisdev.boardgame.Board;
import com.arthurnovaisdev.chess.ChessPiece;
import com.arthurnovaisdev.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
