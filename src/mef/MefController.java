package mef;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MefController implements Initializable {
    public Button anterior;
    public Button siguiente;
    public Label tema;
    ArrayList<Image> imagenes = new ArrayList();
    ArrayList<String> titulos = new ArrayList();
    ArrayList<String> explicaciones = new ArrayList();
    public ImageView main_image;
    int current = 0;

    public void cerrarVentana() {
        anterior.getScene().getWindow().hide();
    }

    public void siguiente() {
        if (current == 3) {
            cerrarVentana();
        }
        if (current < 3) {
            current += 1;
        }
        change();
    }

    public void regresarARecursos() {
        Stage stage = new Stage();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/recursos/recursos.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 600);
            stage.setTitle("Recursos");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        cerrarVentana();
    }

    public void anterior() {

        if (current == 0) {
            regresarARecursos();
            cerrarVentana();
        }

        if (current > 0) {
            current -= 1;
        }

        change();
        System.out.println(current);
    }

    public void change() {
        tema.setText(titulos.get(current));
        main_image.setImage(imagenes.get(current));
    }

    public void loadResources() {
        //Paso 1
        titulos.add("Paso 1");
        tema.setText(titulos.get(current));

        imagenes.add(new Image("https://raw.githubusercontent.com/ragranados/DesafioSimu/master/src/assets/paso1.png?token=AI32UN5NBL3ZIUKPSTXDNUC7ALIDO"));
        main_image.setImage(imagenes.get(current));

        explicaciones.add("Luego, realizamos una interpolacion");

        //Paso 2
        titulos.add("Paso 2");
        tema.setText(titulos.get(current));

        imagenes.add(new Image("https://raw.githubusercontent.com/ragranados/DesafioSimu/master/src/assets/paso2.1.png?token=AI32UN7JX2DSEHVLUM6PKLC7ALMXM"));
        main_image.setImage(imagenes.get(current));

        explicaciones.add("Luego, expresamos en forma matricial");

        titulos.add("Paso 2");
        tema.setText(titulos.get(current));

        imagenes.add(new Image("https://raw.githubusercontent.com/ragranados/DesafioSimu/master/src/assets/paso2.1.png?token=AI32UN7JX2DSEHVLUM6PKLC7ALMXM"));
        main_image.setImage(imagenes.get(current));


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadResources();
    }
}
