//Alan Huang CSE114.02 L10 Project
import java.util.Scanner;

public class ConnectFour {
    static String[][] board = new String[6][7];
    public static void main(String[] args) {
        resetBoard();
        printBoard();
        int turns = 0;
        String currentPlayer = "RED";
        Scanner input = new Scanner(System.in);
        while (turns < board.length * board[0].length) {
            System.out.print(String.format("Drop a %s disk at column (0 - %d): ", currentPlayer, board[0].length - 1));
            int column = input.nextInt();
            int[] diskPosition = dropDisk(column, currentPlayer);
            if (diskPosition == null) {
                System.out.println("Error, try again");
            } else {
                printBoard();
                if (checkWin(diskPosition)) {
                    System.out.println(String.format("%s won the game", currentPlayer));
                    break;
                } else {
                    currentPlayer = currentPlayer.equals("RED") ? "YELLOW" : "RED";
                    turns++;
                }
            }
        }
        if (turns >= board.length * board[0].length) {
            System.out.println("Tie");
        }
        input.close();
    }
    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|");
                System.out.print(board[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        for (int i = 0; i < board[0].length * 2 + 1; i++) {
            System.out.print(".");
        }
        System.out.println();
    }

    public static int[] dropDisk(int column, String disk) {
        int row = board.length - 1;
        if (column < 0 || column > board[0].length - 1) {
            return null;
        }
        while (row >= 0) {
            if (board[row][column].equals(" ")) {
                board[row][column] = disk.substring(0, 1);
                int[] arr = { row, column };
                return arr;
            } else {
                row--;
            }
        }
        return null;
    }

    public static int horizontalWin(int[] diskPosition) {
        int row = diskPosition[0];
        int initialColumn = diskPosition[1];
        String color = board[row][initialColumn];
        int total = 1;
        int column = initialColumn - 1;
        while (column >= 0) {
            if (board[row][column].equals(color)) {
                total++;
                column--;
            } else {
                break;
            }
        }
        column = initialColumn + 1;
        while (column < board[0].length) {
            if (board[row][column].equals(color)) {
                total++;
                column++;
            } else {
                break;
            }
        }
        return total;
    }

    public static int verticalWin(int[] diskPosition) {
        int initialRow = diskPosition[0];
        int column = diskPosition[1];
        String color = board[initialRow][column];
        int total = 1;
        int row = initialRow + 1;
        while (row < board.length) {
            if (board[row][column].equals(color)) {
                total++;
                row++;
            } 
            else {
                break;
            }
        }
        return total;
    }

    public static int bottomRightTopLeftWin(int[] diskPosition) {
        int initialRow = diskPosition[0];
        int initialColumn = diskPosition[1];
        String color = board[initialRow][initialColumn];
        int total = 1;
        int row = initialRow - 1;
        int column = initialColumn - 1;
        while (row >= 0 && column >= 0) {
            if (board[row][column].equals(color)) {
                total++;
                row--;
                column--;
            } 
            else {
                break;
            }
        }
        row = initialRow + 1;
        column = initialColumn + 1;
        while (row < board.length && column < board[0].length) {
            if (board[row][column].equals(color)) {
                total++;
                row++;
                column++;
            } 
            else {
                break;
            }
        }
        return total;
    }

    public static int bottomLeftTopRight(int[] diskPosition) {
        int initialRow = diskPosition[0];
        int initialColumn = diskPosition[1];
        String color = board[initialRow][initialColumn];
        int total = 1;
        int row = initialRow - 1;
        int column = initialColumn + 1;
        while (row >= 0 && column < board[0].length) {
            if (board[row][column].equals(color)) {
                total++;
                row--;
                column++;
            }
             else {
                break;
            }
        }
        row = initialRow + 1;
        column = initialColumn - 1;
        while (row < board.length && column >= 0) {
            if (board[row][column].equals(color)) {
                total++;
                row++;
                column--;
            } 
            else {
                break;
            }
        }
        return total;
    }

    public static boolean checkWin(int[] diskPosition) {
        if (horizontalWin(diskPosition) >= 4|| verticalWin(diskPosition) >= 4 || bottomRightTopLeftWin(diskPosition) >= 4  || bottomLeftTopRight(diskPosition) >= 4) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void resetBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
    }

}
