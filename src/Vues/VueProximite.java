package Vues;

import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;

public class VueProximite extends Region {
    StackPane panneauPrincipal;
    Button btnActionProximite = new Button("lol");

    public void ConstruirePanneau(){
        panneauPrincipal = new StackPane();
        panneauPrincipal.getChildren().add(btnActionProximite);
    }
}
