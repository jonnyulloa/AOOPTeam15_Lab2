public class Knight {
    private String pieceName;
    private String color;
    private char column;
    private char row;

    Knight(){}

    Knight(String pieceName, String color, char column, char row) {
        this.pieceName = pieceName;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    public void setColumn(char initColumn) {
        column = initColumn;
    }
    public void setRow(char initRow) {
        row = initRow;
    }

    public String getColor() {
        return color;
    }
    public char getColumn() {
        return column;
    }
    public char getRow() {
        return row;
    }
    
    // Derek, Jonathan, Ugyen
    public void verifyTarget(char toColumn, char toRow) {
        boolean print = (Math.abs(toRow - row) == 2 && Math.abs(toColumn - column) == 1) ||
                        (Math.abs(toColumn - column) == 2 && Math.abs(toRow - row) == 1);
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}
