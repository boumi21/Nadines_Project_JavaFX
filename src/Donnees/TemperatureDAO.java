package Donnees;

import Modeles.Temperature;

import java.util.ArrayList;
import java.util.List;

public class TemperatureDAO {
    private List<Temperature> listeTemperature;

    private static TemperatureDAO instance;

    public static TemperatureDAO getInstance(){
        if (instance == null) instance = new TemperatureDAO();
        return instance;
    }

    public List<Temperature> CreerListeTemperature(Temperature temperature){
        if (listeTemperature == null){
            listeTemperature = new ArrayList<Temperature>();
        }

        listeTemperature.add(temperature);
        return listeTemperature;
    }
}
