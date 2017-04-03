package sudokugame.models;

/**
 * Created by Daniel on 03.04.2017.
 */
public class SudokuGrid {

    private SudokuCell[][] map;

    public SudokuGrid(){
        this.map = new SudokuCell[9][9];
    }
}
