package Donnees;

import Modeles.Proximite;
import Modeles.Temperature;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProximiteDAO {
    private List<Proximite> listeProximite;

    private static ProximiteDAO instance;

    private ProximiteDAO() {
        listeProximite = new ArrayList<>();
    }

    public static ProximiteDAO getInstance(){
        if (instance == null) instance = new ProximiteDAO();
        return instance;
    }

    public void ajouterDansListeProximite(Proximite proximite){
        System.out.println(listeProximite.toString());
        listeProximite.add(proximite);
    }

    public void nettoyerListe(){
        listeProximite.clear();
    }

    public List<Proximite> getListeProximite() {
        return listeProximite;
    }
}
