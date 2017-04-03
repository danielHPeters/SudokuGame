package sudokugame;

import sudokugame.models.SudokuCell;

/**
 * Created by Daniel on 03.04.2017.
 */
public class Sudoku {

    private SudokuCell[][] cells = new SudokuCell[9][9];

    /**
     * Default constructor initializes the cells
     */
    public Sudoku() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j] = new SudokuCell(i, j);
            }
        }
        // add observers to the cells
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j].addObserver(cells);
            }
        }
    }

    // set known values
    public void setup(int[][] puzzle) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (puzzle[i][j] != 0) {
                    cells[i][j].setValue(puzzle[i][j]);
                }
            }
        }
    }

    public int getCellValue(int i, int j) {
        return cells[i][j].getValue();
    }

    public static void main(String[] args) {

        int[][] puzzle = {
                {0, 6, 2, 3, 0, 0, 9, 0, 0},
                {0, 0, 0, 0, 8, 0, 0, 0, 7},
                {8, 0, 0, 0, 0, 5, 0, 0, 4},
                {0, 0, 5, 0, 2, 0, 0, 0, 6},
                {0, 3, 0, 9, 4, 6, 0, 5, 0},
                {4, 0, 0, 0, 5, 0, 7, 0, 0},
                {7, 0, 0, 6, 0, 0, 0, 0, 3},
                {5, 0, 0, 0, 3, 0, 0, 0, 0},
                {0, 0, 3, 0, 0, 7, 8, 9, 0}
        };

        Sudoku sudoku = new Sudoku();
        sudoku.setup(puzzle);


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku.getCellValue(i, j) + "|");
            }
            System.out.println();
        }
    }
}
