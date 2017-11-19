package Donnees;

import Modeles.Temperature;

import java.util.ArrayList;
import java.util.List;

public class TemperatureDAO {
    private List<Temperature> listeTemperature;

    private static TemperatureDAO instance;

    private TemperatureDAO() {
        listeTemperature = new ArrayList<>();
    }

    public static TemperatureDAO getInstance(){
        if (instance == null) instance = new TemperatureDAO();
        return instance;
    }

    public void ajouterDansListeTemperature(Temperature temperature){
        listeTemperature.add(temperature);
    }

    public void nettoyerListe(){
        listeTemperature.clear();
    }

    public List<Temperature> getListeTemperature() {
        return listeTemperature;
    }
}
