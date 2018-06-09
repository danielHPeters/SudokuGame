package ch.peters.daniel.sudoku.models;

/**
 * Sudoku grid class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class SudokuGrid {
  private SudokuCell[][] map;

  public SudokuGrid() {
    this.map = new SudokuCell[9][9];
  }
}
