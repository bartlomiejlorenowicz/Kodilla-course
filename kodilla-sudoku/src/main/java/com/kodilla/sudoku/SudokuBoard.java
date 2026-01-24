package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i < 9; i++) {
            rows.add(new SudokuRow());
        }
    }

    public SudokuElement getElement(int row, int col) {
        return rows.get(row).getElements().get(col);
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    public SudokuBoard deepCopy() {
        SudokuBoard copy = new SudokuBoard();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                copy.getElement(r,c).setValue(this.getElement(r,c).getValue());
            }
        }
        return copy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0) sb.append("-------------------------\n");
            for (int c = 0; c < 9; c++) {
                if (c % 3 == 0) sb.append("| ");
                int val = getElement(r,c).getValue();
                sb.append(val == SudokuElement.EMPTY ? "." : val).append(" ");
            }
            sb.append("|\n");
        }
        sb.append("-------------------------\n");
        return sb.toString();
    }
}
