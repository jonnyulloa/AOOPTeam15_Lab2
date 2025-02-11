
public class Knight {
    private static String pieceName;
    private static String color;
    private static char column;
    private static char row;

    public Knight(){
        //Empty Constructor
    }

    public Knight(String pieceName, String color, char column, char row) {
        this.pieceName = pieceName;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public static void setColumn(char initColumn) {
        column = initColumn; //Set new column position
    }
    public static void setRow(char initRow) {
        row = initRow; //Set new row position
    }

    public static String getColor() {
        return color; //get color of chess piece
    }
    public static char getColumn() {
        return column; //get current column position of chess piece
    }
    public static char getRow() {
        return row; //get row position
    }
    
    // Derek, Jonathan, Ugyen
    public static void verifyTarget(char toColumn, char toRow) {
        boolean print = (Math.abs(toRow - row) == 2 && Math.abs(toColumn- column) == 1) ||
                        (Math.abs(toColumn- column) == 2 && Math.abs(toRow - row) == 1); ////The knight can move one square in one direction then two squares at an angle                                                                            
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}
