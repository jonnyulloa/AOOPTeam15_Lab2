// Derek
class Chessboard {
    static final char MAX_ROW = 8;
    static final char MIN_ROW = 1;

    // Derek
    public static boolean withinChessboard(char column, char row) {
        return ((column >= 'a' && column <= 'h') && (row >= MIN_ROW && row <= MAX_ROW));
    }
   

    enum Piece {
        KING, ROOK, PAWN, KNIGHT, QUEEN, BISHOP;
    }

    enum Color {
        WHITE, BLACK;
    }

    public static boolean validPiece(String chessPiece) {
        try {
            Piece.valueOf(chessPiece.trim().toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static boolean validColor(String color) {
       try {
            Color.valueOf(color.trim().toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }    
}