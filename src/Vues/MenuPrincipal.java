package Vues;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.sql.SQLException;

public class MenuPrincipal extends Region {

    public MenuPrincipal(){
        super();
        ConstruirePanneau();
    }

    private void ConstruirePanneau(){

        System.out.println("MDRRRRRRRR");
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setPrefSize(400, (600-30));

        Button btnActionProximite = new Button("Proximite en fonction du temps");
        btnActionProximite.setPrefSize(200, 15);
        Button btnActionTemperature = new Button("Temperature en fonction du temps");
        btnActionTemperature.setPrefSize(200, 15);
        Button btnActionProximiteEtTemperature = new Button("Proximite en fonction de la temperature");
        btnActionProximiteEtTemperature.setPrefSize(200, 15);

        btnActionProximite.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
               /* try {
                    ControleurVue.getInstance().actionAjouterItem();
                } catch (ClassNotFoundException | SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }*/
            }
        });

        btnActionTemperature.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
               /* try {
                    ControleurVue.getInstance().actionAjouterItem();
                } catch (ClassNotFoundException | SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }*/
            }
        });

        btnActionProximiteEtTemperature.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
               /* try {
                    ControleurVue.getInstance().actionAjouterItem();
                } catch (ClassNotFoundException | SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }*/
            }
        });

        vBox.getChildren().addAll(btnActionProximite, btnActionTemperature, btnActionProximiteEtTemperature);

        this.getChildren().add(vBox);


    }
}
