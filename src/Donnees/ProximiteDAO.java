package Donnees;

import Modeles.Proximite;
import Modeles.Temperature;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProximiteDAO {
    private List<Proximite> listeProximite;

    private static ProximiteDAO instance;

    private Connection connection = null;

    public ProximiteDAO() {
        this.connection = Accesseur.getConnection();
    }

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
