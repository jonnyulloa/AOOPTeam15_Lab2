public class Rook {
    private static String pieceName;
    private static String color;
    private static char column;
    private static char row;

    public Rook(){
        //Empty Constructor
    }

    public Rook(String pieceName, String color, char column, char row) {
        this.pieceName = pieceName;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public static void setColumn(char initColumn) {
        column = initColumn; //set new initial column after asking the user
    }
    public static void setRow(char initRow) {
        row = initRow; //set new initial row after asking the user
    }

    public static String getColor() {
        return color; //Getter for color of chess piece
    }
    public static char getColumn() {
        return column; //Getter for column position of chess piece
    }
    public static char getRow() {
        return row; //Getter for row position of chess piece
    }
    
    // Derek, Jonathan, Ugyen
    public static void verifyTarget(char toColumn, char toRow) {
        boolean print = (column == toColumn|| column == toRow); //The Rook can only move vertically or horizontally, with no limits on squares
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}
