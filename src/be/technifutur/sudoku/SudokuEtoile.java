package be.technifutur.sudoku;

public class SudokuEtoile implements Sudoku{
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
