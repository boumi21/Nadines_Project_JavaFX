package Donnees;

import Modeles.Proximite;

import java.util.ArrayList;
import java.util.List;

public class ProximiteDAO {
    private List<Proximite> listeProximite;

    private static ProximiteDAO instance;

    public static ProximiteDAO getInstance(){
        if (instance == null) instance = new ProximiteDAO();
        return instance;
    }

    public List<Proximite> CreerListeProximite(Proximite proximite){
        if (listeProximite == null){
            listeProximite = new ArrayList<Proximite>();
        }

        listeProximite.add(proximite);
        return listeProximite;
    }
}
