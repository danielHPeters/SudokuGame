package sudokugame.models;

import javafx.beans.InvalidationListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Daniel on 27.03.2017.
 */
public class SudokuCell extends Observable implements Observer {

    /**
     *
     */
    private List<Integer> values = new ArrayList<>();

    /**
     *
     */
    private int row;

    /**
     *
     */
    private int col;

    private boolean locked;

    /**
     *
     */
    private boolean solved;

    /**
     * Default constructor. Only does not set the value of the field. Used for empty fields
     */
    public SudokuCell() {

    }

    /**
     * Constructor. Initializes the Value of this Field and locks it
     */
    public SudokuCell(int row, int col) {
        this.row = row;
        this.col = col;
        for (int n = 1; n <= 9; n++) {
            values.add(new Integer(n));
        }
    }

    /**
     * Add the cells that are in the same row / line and those in the same box as observers to this SudokuCell
     *
     * @param cells all the SudokuCells
     */
    public synchronized void addObserver(SudokuCell[][] cells) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                boolean isSelf = (i == this.row) && (j == this.col);
                boolean isInSameLine = (i == this.row) || (j == this.col);
                boolean isInSameBox = (i / 3 == this.row / 3) && (j / 3 == this.col / 3);

                if (!isSelf && (isInSameLine || isInSameBox)) {
                    super.addObserver(cells[i][j]);
                }
            }
        }
    }

    /**
     * Set the value andd
     * @param value
     */
    public void setValue(int value) {
        this.values.clear();
        this.values.add(value);
        this.solved = true;
        super.setChanged();
        super.notifyObservers(value);
    }

    /**
     * Observe and remove the entry set in the observable
     */
    @Override
    public void update(Observable o, Object arg) {
        this.values.remove(arg);

        if (!this.solved && this.values.size() == 1) {

            int value = values.get(0);
            setValue(value);
        }
    }

    /**
     * Get the integer Value of this Field. The value is only other than 0 if
     * the value has been successfully set.
     *
     * @return the integer value of this Field
     */
    public int getValue() {

        int val = 0;

        if (this.values.size() == 1) {
            val = this.values.get(0);
        }

        return val;
    }

}
