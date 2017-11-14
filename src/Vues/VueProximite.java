package Vues;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class VueProximite extends Region {

    public VueProximite(){
        super();
        ConstruirePanneau();
    }

    private void ConstruirePanneau(){
        BorderPane panneauPrincipal = new BorderPane();

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setPrefSize(400, (600-30));

        Button btnActionRetourEnArriere = new Button("retour");
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

        vBox.getChildren().add(btnActionRetourEnArriere);
        this.getChildren().add(vBox);
    }
}
