package sudokugame.controller;

import java.io.BufferedReader;
import java.io.FileWriter;

/**
 * Created by Daniel on 27.03.2017.
 */
public class SaveManager {

    /**
     *
     */
    private String file;

    /**
     *
     */
    private BufferedReader reader;

    /**
     *
     */
    private FileWriter writer;

    /**
     * Save the state of the game to the specified file
     * @param file
     */
    public void save(String file){

    }

    /**
     * Load a savefile into the game
     * @param file
     */
    public void load(String file){

    }

    /**
     *
     * @return
     */
    public String getFile() {
        return file;
    }

    /**
     *
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }
}
