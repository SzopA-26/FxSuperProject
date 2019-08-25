package Theater;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePage {
    @FXML Button nextBtn;
    @FXML ImageView dogImg;

    @FXML public void handleNextBtnOnAction(ActionEvent event) throws IOException {
        Button b = (Button) event.getSource();
        Stage s = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListPage.fxml"));
        s.setScene(new Scene(loader.load(),300,300));
        s.show();
    }

    @FXML public void handleDogImgOnAction(MouseEvent event) throws IOException {
        ImageView b = (ImageView) event.getSource();
        Stage s = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListPage.fxml"));
        s.setScene(new Scene(loader.load(),300,300));
        s.show();
    }

}
