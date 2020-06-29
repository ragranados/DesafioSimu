package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.scene.image.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button anterior;
    public Button siguiente;
    public ImageView main_image;
    public Label tema;
    ArrayList<Image> imagenes = new ArrayList();
    ArrayList<String> titulos = new ArrayList();
    int current = 0;

    public void anterior(){
        if(current > 0){
            current-=1;
        }
        loadResources();
    }

    public void siguiente(){
        current+=1;
        loadResources();
    }

    public void loadResources(){
        titulos.add("Dominio a utilizar");
        tema.setText(titulos.get(current));

        imagenes.add(new Image("https://raw.githubusercontent.com/ragranados/DesafioSimu/master/src/assets/dominio.png?token=AI32UN54UXED7C32KDW3O6C7AJ576"));
        main_image.setImage(imagenes.get(current));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadResources();
    }
}
