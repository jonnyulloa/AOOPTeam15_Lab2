
public class Pawn {
    private String pieceName;
    private String color;
    private char column;
    private char row;

    Pawn(){}

    Pawn(String pieceName, String color, char column, char row) {
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
        boolean print = false;

        
        // print = column == toColumn && (toRow - row == 1 || (row == 2 && toRow - row == 4)); 
        
        if (color.toUpperCase().equals("WHITE")) {
            print = column == toColumn && (toRow - row == 1 || (row == '2' && toRow == '4')); 
        } 
        else if (color.toUpperCase().equals("BLACK")){
            print = column == toColumn && (toRow - row == -1 || (row == '7' && toRow == '5')); 
        }
        System.out.println(pieceName + " at " + column + row + (print ? " can " : " cannot ") + "move to " + toColumn + toRow);  
    }
}
