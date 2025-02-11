
public class Pawn {
    private static String pieceName;
    private static String color;
    private static char column;
    private static char row;

    Pawn(){}

    Pawn(String pieceName, String color, char column, char row) {
        this.pieceName = pieceName;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public static void setColumn(char initColumn) {
        column = initColumn;
    }
    public static void setRow(char initRow) {
        row = initRow;
    }

    public static String getColor() {
        return color;
    }
    public static char getColumn() {
        return column;
    }
    public static char getRow() {
        return row;
    }
    
    // Derek, Jonathan, Ugyen
    public static void verifyTarget(char toColumn, char toRow) {
        boolean print = column == toColumn&& (toRow - row == 1 || (row == 2 && toRow == 4)); 
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}