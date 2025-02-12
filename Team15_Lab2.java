//Derek Gamboa, Jonathan Ulloa, Ugyen Dorji
//This program takes in a user input, which should be between a-h and 1-8 to ensure its inside of the chess board
//The program then takes the input and checks for each chess piece if the move is acceptable
//The move is based on each chess piece's rules for moving and where the chess piece is originally on the board
//Changelog
//1/27/2025 Derek: completed check movement methods for pawn, king, rook, and knight
//2/4/2025 Derek: Added comments explaining the methods
// 1/24/25 Jonathan: Added file reader, user input, and outline for chess class and chess piece movments
// 2/3/25 Jonathan: Simplified code
import java.util.Scanner;

public class Team15_Lab2 {
    static Scanner scanner;
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
            boolean checkFirst = true;
            while (checkFirst) { 
                scanner = new Scanner(System.in);
                askForPiece();
                askForColor();
                askForInitPos();
                askForToPos();
                process();
                boolean checkSecond = true;
                char choice;
                while (checkSecond) {
                    System.out.println("Would you like to try another target position? y or n");
                    choice = scanner.next().charAt(0);
                    if (choice == 'y') {
                        askForToPos();
                        process();
                    } else if (choice == 'n') {
                        System.out.println("Would you like to try another chess piece? y or n");
                        choice = scanner.next().charAt(0);
                        if (choice == 'y') {
                            checkSecond = false;
                        } else if (choice == 'n') {
                            System.exit(0);
                        }
                    }
                }
            }
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
            System.out.println("Pick a piece color (e.g. White or Black): ");
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

    static void process() {
        switch (piece.toUpperCase()) {
            case "KING": // Derek, Ugyen
                King king = new King(piece, pieceColor, initColumn, initRow);
                king.verifyTarget(toColumn, toRow);
                break;
            case "ROOK": // Derek, Ugyen
                Rook rook = new Rook(piece, pieceColor, initColumn, initRow);
                rook.verifyTarget(toColumn, toRow);
                break;
            case "PAWN": // Derek, Jonathan
                Pawn pawn = new Pawn(piece, pieceColor, initColumn, initRow);
                pawn.verifyTarget(toColumn, toRow);
                break;
            case "KNIGHT": // Derek, Ugyen
                Knight knight = new Knight(piece, pieceColor, initColumn, initRow);
                knight.verifyTarget(toColumn, toRow);
                break;
            case "QUEEN": // Jonathan, Ugyen
                Queen queen = new Queen(piece, pieceColor, initColumn, initRow);
                queen.verifyTarget(toColumn, toRow);
                break;
            case "BISHOP": // Derek, Jonathan
                Bishop bishop = new Bishop(piece, pieceColor, initColumn, initRow);
                bishop.verifyTarget(toColumn, toRow);
                break;
        }
    }

}
