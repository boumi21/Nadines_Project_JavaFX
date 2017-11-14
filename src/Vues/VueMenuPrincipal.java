package Vues;

import Controleur.ControleurVues;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VueMenuPrincipal extends Application {
    private BorderPane panneauPrincipal;
    Button btnActionProximite;
    Button btnActionTemperature;
    Button btnActionProximiteEtTemperature;

    MenuPrincipal menuPrincipal;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage scenePrincipale) throws Exception {

        ControleurVues.getInstance().setVueMenuPrincipal(this);

        scenePrincipale.setTitle("Vues.VueMenuPrincipal principal");

        menuPrincipal = new MenuPrincipal();

        panneauPrincipal = new BorderPane();

        Scene scene = new Scene(panneauPrincipal, 400, 600);

        menuPrincipal.setPrefSize(scene.getWidth(), (scene.getHeight() - 30));
        menuPrincipal.setStyle("-fx-background-color: #279385");

        panneauPrincipal.setPrefSize(scene.getWidth(), scene.getHeight());
        panneauPrincipal.setCenter(menuPrincipal);

        scenePrincipale.setScene(scene);
        scenePrincipale.show();


    }

}
