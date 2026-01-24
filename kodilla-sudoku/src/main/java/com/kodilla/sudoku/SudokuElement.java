package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static final int EMPTY = -1;

    private int value;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        this.value = EMPTY;
        for (int i = 1; i <= 9; i++) {
            possibleValues.add(i);
        }
    }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }

    public List<Integer> getPossibleValues() { return possibleValues; }
}
