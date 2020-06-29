package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import javafx.scene.image.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button boton_prueba;
    public ImageView main_image;
    //public Image image_change;
    ArrayList<Image> imagenes = new ArrayList();


    public void loadImages(){
        Image imagen = new Image("https://pbs.twimg.com/media/EboBtVbXkAEkDm6?format=jpg&name=small");
        //imagenes.add(imagen);
        main_image.setImage(imagen);
        System.out.println("hola");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadImages();

    }
}
