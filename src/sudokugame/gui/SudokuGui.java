package sudokugame.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SudokuGui extends Application {

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
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        initScoresDisplay(primaryStage);
    }
    
    private void initScoresDisplay(Stage parentStage){
        this.scoresDisplay = new Stage();
        this.scoresDisplay.setTitle("Scores");
        this.scoresDisplay.initOwner(parentStage);
        this.scoresDisplay.initModality(Modality.WINDOW_MODAL);
    }
    
    public Stage getScoresDisplay(){
        return this.scoresDisplay;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
