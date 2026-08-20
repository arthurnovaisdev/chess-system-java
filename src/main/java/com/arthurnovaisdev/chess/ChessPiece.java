package com.arthurnovaisdev.chess;

import com.arthurnovaisdev.boardgame.Board;
import com.arthurnovaisdev.boardgame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
