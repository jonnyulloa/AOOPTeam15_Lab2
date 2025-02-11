//Derek Gamboa, Jonathan Ulloa, Ugyen Dorji
//This program takes in a user input, which should be between a-h and 1-8 to ensure its inside of the chess board
//The program then takes the input and checks for each chess piece if the move is acceptable
//The move is based on each chess piece's rules for moving and where the chess piece is originally on the board
//Changelog
//1/27/2025 Derek: completed check movement methods for pawn, king, rook, and knight
//2/4/2025 Derek: Added comments explaining the methods
// 1/24/25 Jonathan: Added file reader, user input, and outline for chess class and chess piece movments
// 2/3/25 Jonathan: Simplified code
// 2/9/25 Ugyen: Got on call with Derek and simplified the code.
// 2/19/25 Ugyen: Worked on the classes and attributes for each piece.

import java.util.Scanner;

public class Team15_Lab2 {
    static Scanner scanner = new Scanner(System.in);
    static String piece;
    static String pieceColor;
    static char initColumn;
    static char initRow;
    static char toColumn;
    static char toRow; 

    public static void main(String[] args) {
        // Derek, Jonathan, Ugyen
            //This section gives instructions for the user to follow
            //And it takes the input which it will check if its valid using our validPos method
 
            askForPiece();
            switch (piece) {
                case "King": // Derek, Ugyen
                    King(String pieceName, String color, char column, char row)
                    break;
                case "Rook": // Derek, Ugyen
                    break;
                case "Pawn": // Derek, Jonathan
                    break;
                case "Knight": // Derek, Ugyen
                case "Queen": // Jonathan, Ugyen
                    break;
                case "Bishop": // Derek, Jonathan
                    break;
            }

            askForColor();
            askForInitPos();
            askForToPos();
            
            // scanner.close();
    }

    static void askForPiece() {
        while (true) {
            System.out.println("Enter piece to move (e.g Pawn, Rook, Knight, Bishop, Queen, and King: ");
            piece = scanner.nextLine();
            if (!Chessboard.validPiece(piece)) {
                System.out.println("That piece is not a chess piece. Try again.");
            } else {
                break;
            }
        }
    }
    static void askForColor() {
        while (true) {
            System.out.println("Pick a piece color (e.g. White or Black: ");
            pieceColor = scanner.nextLine();
            if (!Chessboard.validColor(pieceColor)) {
                System.out.println("That piece color is not valid. Try again.");
            } else {
                break;
            }
        }
    }

    static void askForInitPos() {
        while (true) {
            System.out.println("Enter initial position for column (e.g a-h): ");
            initColumn = scanner.next().charAt(0);
            System.out.println("Enter initial position for row (e.g 1-8): ");
            initRow = scanner.next().charAt(0);
            if (!Chessboard.withinChessboard(initColumn, initRow)) {
                System.out.println("That position is not on the chess board. Try again.");
            } else {
                break;
            }
        }
    }

    static void askForToPos() {
        while (true) {
            System.out.println("Enter target position for column (e.g a-h): ");
            toColumn = scanner.next().charAt(0);
            System.out.println("Enter target position for row (e.g 1-8): ");
            toRow = scanner.next().charAt(0);
            if (!Chessboard.withinChessboard(toColumn, toRow)) {
                System.out.println("That column is not valid. Try again.");
            } else {
                break;
            }
        }
    }
}
