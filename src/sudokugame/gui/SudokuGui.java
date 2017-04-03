package sudokugame.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class SudokuGui extends Application {

    /**
     *
     */
    private MenuBar mBar;

    /**
     *
     */
    private Menu file;

    /**
     *
     */
    private Menu scores;

    /**
     *
     */
    private Menu options;

    /**
     *
     */
    private MenuItem save;

    /**
     *
     */
    private MenuItem load;

    /**
     *
     */
    private MenuItem exit;

    /**
     *
     */
    private MenuItem showAllScores;

    /**
     *
     */
    private FileChooser chooser;

    /**
     * 
     */
    private Stage scoresDisplay;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
