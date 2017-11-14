package Vues;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;

public class VueProximite extends Region {

    public VueProximite(){
        super();
        ConstruirePanneau();
    }

    private void ConstruirePanneau(){
        BorderPane panneauPrincipal = new BorderPane();

        Button btnActionRetourEnArriere = new Button("Annuler");
        btnActionRetourEnArriere.setPrefSize(200, 15);
        /*btnActionRetourEnArriere.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                try {
                    ControleurVue.getInstance().actionRetourEnArriere();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });*/

        panneauPrincipal.getChildren().add(btnActionRetourEnArriere);
        this.getChildren().add(panneauPrincipal);
    }
}
