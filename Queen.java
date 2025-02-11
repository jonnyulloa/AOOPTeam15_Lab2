
public class Queen {
    private static String pieceName;
    private static String color;
    private static char column;
    private static char row;

    Queen(){
        //Empty Constructor
    }

    Queen(String pieceName, String color, char column, char row) {
        this.pieceName = pieceName;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public static void setColumn(char initColumn) {
        column = initColumn; //Set new column position after asking the user
    }
    public static void setRow(char initRow) {
        row = initRow; //Set new row position after asking the user
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
        boolean print = (Math.abs(toRow - row) == Math.abs(toColumn- column) ||  //The queen can move vertically, horizontally, and diagonally with no limits on the number of squares
                        (column == toColumn) || (row == toRow)); //First check if the queen moved vertically, horizontally, then vertically
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}
