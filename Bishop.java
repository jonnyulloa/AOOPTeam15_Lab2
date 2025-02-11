
public class Bishop {
    private static String pieceName;
    private static String color;
    private static char column;
    private static char row;

    public Bishop(){
        //Empty Constructor
    }

    public Bishop(String pieceName, String color, char column, char row) {
        this.pieceName = pieceName;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public static void setColumn(char initColumn) {
        column = initColumn; //set new column position
    }
    public static void setRow(char initRow) {
        row = initRow; //set new row position
    }

    public static String getColor() {
        return color; //get color of chess piece
    }
    public static char getColumn() {
        return column; //get current column position
    }
    public static char getRow() {
        return row; //get current row position
    }
    
    // Derek, Jonathan, Ugyen
    public static void verifyTarget(char toColumn, char toRow) {
        boolean print = (Math.abs(toRow - row) == Math.abs(toColumn- column)); //The Bishop can move vertically any number of squares                                              
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}
