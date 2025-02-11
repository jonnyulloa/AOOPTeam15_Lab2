
public class Pawn {
    private static String pieceName;
    private static String color;
    private static char column;
    private static char row;

    public Pawn(){
        //Empty Constructor
    }

    public Pawn(String pieceName, String color, char column, char row) {
        this.pieceName = pieceName;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public static void setColumn(char initColumn) {
        column = initColumn; //Set new column position after asking the user
    }
    public static void setRow(char initRow) {
        row = initRow; //Set new row position position after asking the user
    }

    public static String getColor() {
        return color; //Get color of chess piece
    }
    public static char getColumn() {
        return column; //get column position of chess piece
    }
    public static char getRow() {
        return row; //get row position of chess piece
    }
    
    // Derek, Jonathan, Ugyen
    public static void verifyTarget(char toColumn, char toRow) {
        boolean print = column == toColumn&& (toRow - row == 1 || (row == 2 && toRow == 4)); //The pawn can only move one square forward or two squares forward if its the first move its made in the game
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}
