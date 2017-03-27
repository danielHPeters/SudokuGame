package sudokugame.models;

/**
 * Created by Daniel on 27.03.2017.
 */
public class SudokuField {

    /**
     * the value of this field
     */
    private int value;

    /**
     * Initial fields are locked to avoid accidental overriding
     */
    private boolean locked;

    /**
     * Default constructor. Only does not set the value of the field. Used for empty fields
     */
    public SudokuField(){

    }

    /**
     * Constructor. Initializes the Value of this Field and locks it
     * @param value
     */
    public SudokuField(int value){
        this.value = value;
        this.locked = true;
    }

    /**
     * Get the integer Value of this Field
     * @return the integer value of this Field
     */
    public int getValue(){
        return this.value;
    }
}
