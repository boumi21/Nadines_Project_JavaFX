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
    Button btnActionProximite = new Button("Proximite en fonction du temps");
    Button btnActionTemperature = new Button("Temperature en fonction du temps");
    Button btnActionProximiteEtTemperature = new Button("Proximite en fonction de la temperature");


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage scenePrincipale) throws Exception {

        ControleurVues.getInstance().setVueMenuPrincipal(this);

        scenePrincipale.setTitle("Vues.VueMenuPrincipal principal");

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setPrefSize(400, (600-30));

       /* btnActionProximite.setOnAction(e-> ButtonClicked(e));
        btnActionTemperature.setOnAction(e-> ButtonClicked(e));
        btnActionProximiteEtTemperature.setOnAction(e-> ButtonClicked(e));*/




        vBox.getChildren().add(btnActionTemperature);
        vBox.getChildren().add(btnActionProximite);
        vBox.getChildren().add(btnActionProximiteEtTemperature);

        panneauPrincipal.getChildren().add(vBox);


    }

    /*public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource()==btnActionProximite) {
            stagePrincipal.setScene(scene1);
        }else if (e.getSource()==btnActionTemperature) {
            stagePrincipal.setScene(scene2);
        } else {
            stagePrincipal.setScene(scene3);
        }
    }*/
}
