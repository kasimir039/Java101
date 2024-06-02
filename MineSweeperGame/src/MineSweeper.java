import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class MineSweeper {

    String[][] userGameBoard;
    String[][] adminGameBoard;
    int numberOfMines;
    int totalCells;

    Random rand = new Random();

    MineSweeper(int rows, int cols) {
        this.userGameBoard = new String[rows][cols];
        this.adminGameBoard = new String[rows][cols];
        this.totalCells = rows * cols;
        this.numberOfMines = totalCells / 4; // Fixed number of mines
        initializeBoards();
    }

    public void initializeBoards() {
        for (int i = 0; i < userGameBoard.length; i++) {
            Arrays.fill(userGameBoard[i], "-");
            Arrays.fill(adminGameBoard[i], "-");
        }
        placeMines();
    }

    public void placeMines() {
        int minesPlaced = 0;
        while (minesPlaced < numberOfMines) {
            int randRow = rand.nextInt(adminGameBoard.length);
            int randCol = rand.nextInt(adminGameBoard[0].length);

            if (!adminGameBoard[randRow][randCol].equals("*")) {
                adminGameBoard[randRow][randCol] = "*";
                minesPlaced++;
            }
        }
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        int openedCells = 0;
        boolean gameOver = false;

        System.out.println("Welcome to the minesweeper game");
        printBoard(adminGameBoard);
        printBoard(userGameBoard);

        while (!gameOver) {
            System.out.print("Please select row: ");
            int selectRow = input.nextInt();
            System.out.print("Please select column: ");
            int selectCol = input.nextInt();

            if (selectRow < 0 || selectRow >= userGameBoard.length || selectCol < 0 || selectCol >= userGameBoard[0].length) {
                System.out.println("Invalid input. Please select a valid row and column.");
                continue;
            }

            if (userGameBoard[selectRow][selectCol].equals("-")) {
                if (adminGameBoard[selectRow][selectCol].equals("*")) {
                    System.out.println("Game Over! You hit a mine.");
                    gameOver = true;
                    printBoard(adminGameBoard);
                } else {
                    userGameBoard[selectRow][selectCol] = "0";
                    openedCells++;
                    if (openedCells == (totalCells - numberOfMines)) {
                        System.out.println("Congratulations! You've cleared the minefield!");
                        gameOver = true;
                    }
                    printBoard(userGameBoard);
                }
            } else {
                System.out.println("This cell is already opened. Please select a different cell.");
            }
        }
    }

    public void printBoard(String[][] board) {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("==========================================");
    }
}
