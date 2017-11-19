package Vues;

import Controleur.ControleurVues;
import Donnees.Connection;
import Donnees.ProximiteDAO;
import Donnees.TemperatureDAO;
import Modeles.Temperature;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class VueTemperature extends Region {

    public VueTemperature(){
        super();
        ConstruirePanneau();
    }

    private void ConstruirePanneau(){

        Connection connection = new Connection();
        connection.start();
        while (!connection.isFini());
        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setPrefSize(400, (600-30));


        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Temps (heures)");
        yAxis.setLabel("Température (degrés celsius)");
        //creating the chart
        final LineChart<Number,Number> lineChart =
                new LineChart<Number,Number>(xAxis,yAxis);

        lineChart.setTitle("Température en fonction du temps");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("Cellulaire");
        //populating the series with data
        for (int i = 0; i < TemperatureDAO.getInstance().getListeTemperature().size(); i++) {
            series.getData().add(new XYChart.Data(i, TemperatureDAO.getInstance().getListeTemperature().get(i).getValeurTemperature()));
        }


        lineChart.getData().add(series);



        Button btnActionRetourEnArriere = new Button("retour");
        btnActionRetourEnArriere.setPrefSize(300, 15);
        btnActionRetourEnArriere.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                try {
                    ControleurVues.getInstance().actionRetourEnArriere();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        vBox.getChildren().add(lineChart);
        vBox.getChildren().add(btnActionRetourEnArriere);
        this.getChildren().add(vBox);
    }
}
