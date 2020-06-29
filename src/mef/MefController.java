package mef;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class MefController {
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

    public void anterior() {

        if (current == 0) {
            cerrarVentana();
        }

        if (current > 0) {
            current -= 1;
        }

        change();
        System.out.println(current);
    }

    public void change() {

    }
}
