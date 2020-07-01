package componentes;

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

public class ComponentesController implements Initializable {
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
        if (current == imagenes.size() - 1) {
            abrirVideo();
            cerrarVentana();
        }
        if (current < imagenes.size() - 1) {
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

    public void abrirVideo(){
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
        titulos.add("Definiendo en terminos de Epsilon");
        tema.setText(titulos.get(current));

        imagenes.add(new Image("/assets/comp1.png"));
        main_image.setImage(imagenes.get(current));

        titulos.add("Definiendo en terminos de Epsilon");
        imagenes.add(new Image("/assets/comp2.png"));

        titulos.add("Asumiremos");
        imagenes.add(new Image("/assets/comp3.png"));

        titulos.add("Definiendo matriz C");
        imagenes.add(new Image("/assets/comp4.png"));

        titulos.add("Definiendo matriz C");
        imagenes.add(new Image("/assets/comp5.png"));

        titulos.add("Definiendo matriz K");
        imagenes.add(new Image("/assets/comp6.png"));

        titulos.add("Definiendo matriz K");
        imagenes.add(new Image("/assets/comp7.png"));

        titulos.add("Similitud entre ecuaciones");
        imagenes.add(new Image("/assets/comp10.png"));

        titulos.add("Definiendo matrices lado derecho");
        imagenes.add(new Image("/assets/comp8.png"));

        titulos.add("Definiendo matrices lado derecho");
        imagenes.add(new Image("/assets/comp9.png"));

        /*titulos.add("Ensamblaje");
        imagenes.add(new Image("/assets/ensablaje.gif"));*/

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadResources();
    }
}
