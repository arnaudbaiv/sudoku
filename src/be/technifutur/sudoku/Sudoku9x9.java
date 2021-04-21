package be.technifutur.sudoku;

public class Sudoku9x9 implements Sudoku{

    int[][]tab1 = new int[9][9];

    @Override
    public void addValue(int line, int column, char value) {

    }

    @Override
    public void getValue(int line, int column) {

    }

    @Override
    public boolean isValueValid(char value) {
        return false;
    }

    @Override
    public boolean isCellValid(int line, int column) {
        return false;
    }
}
