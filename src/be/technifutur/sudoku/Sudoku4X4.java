package be.technifutur.sudoku;

public class Sudoku4X4 implements Sudoku{

    int[][]tab1 = new int[4][4];
    private char[][] data;

    @Override
    public void addValue(int line, int column, char value) {
        if(isCellValid(line,column) && isValueValid(value)){
            this.data[line][column] = value;
        }
    }

    @Override
    public void getValue(int line, int column) {
        char value = EMPTY;
        if(isCellValid(line, column)){
            value = this.data[line][column];
        }
    }


    @Override
    public boolean isValueValid(char value) {
        char val = EMPTY;
        if(value < 1 || value > 4){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public boolean isCellValid(int line, int column) {
        if(line < 1 || line > 4){
            return false;
        }else{
            return true;
        }

    }
}
