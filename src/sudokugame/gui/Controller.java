package sudokugame.gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class Controller {
    
    public void handleKeyInput() {

    }
    
    @FXML
    public void handleMenuEvents(ActionEvent e){
        MenuItem source = (MenuItem) e.getSource();

        switch (source.getText()) {
            case "Save Game":
                System.out.println("Saving game");
                break;
            case "Load Game":
                System.out.println("Loading game");
                break;
            case "Exit":
                exit();
                break;
            default:
                break;
        }
    }
    
    public void exit(){
        Platform.exit();
    }
}
