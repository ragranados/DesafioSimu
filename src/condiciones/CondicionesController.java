package condiciones;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CondicionesController implements Initializable {
    public Button anterior;
    public Button siguiente;
    //public Label tema;
    ArrayList<Image> imagenes = new ArrayList();
    ArrayList<String> titulos = new ArrayList();
    ArrayList<String> explicaciones = new ArrayList();
    public ImageView imagen;
    public MediaView video;

    int current = 0;

    public void cerrarVentana() {
        anterior.getScene().getWindow().hide();
    }

    public void anterior() {
        Stage stage = new Stage();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/ensamblaje/ensamblaje.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 600);
            stage.setTitle("Recursos");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        cerrarVentana();
    }

    public void siguiente(){
        Stage stage = new Stage();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/sample/sample.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 600);
            stage.setTitle("Recursos");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        cerrarVentana();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagenes.add(new Image("/assets/condiciones.gif"));
        imagen.setImage(imagenes.get(current));
    }
}
