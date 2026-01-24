package com.kodilla.sudoku;

import java.util.Scanner;
import java.util.Stack;

public class SudokuGame {

    private SudokuBoard board = new SudokuBoard();
    private Stack<Backtrack> backtracks = new Stack<>();

    public boolean resolveSudoku() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(board);

            System.out.println("Podaj ruch (x,y,value) lub wpisz SUDOKU:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("SUDOKU")) {
                solve();
                System.out.println("ROZWIĄZANIE:");
                System.out.println(board);
                return false;
            }

            String[] parts = input.split(",");
            int col = Integer.parseInt(parts[0]) - 1;
            int row = Integer.parseInt(parts[1]) - 1;
            int value = Integer.parseInt(parts[2]);

            board.getElement(row, col).setValue(value);
        }

    }

    private boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board.getElement(row, col).getValue() == SudokuElement.EMPTY) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(row, col, num)) {
                            board.getElement(row, col).setValue(num);
                            if (solve()) return true;
                            board.getElement(row, col).setValue(SudokuElement.EMPTY);
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (board.getElement(row, i).getValue() == num) return false;
            if (board.getElement(i, col).getValue() == num) return false;
        }

        int boxRow = row - row % 3;
        int boxCol = col - col % 3;

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board.getElement(boxRow + r, boxCol + c).getValue() == num)
                    return false;

        return true;
    }
}

