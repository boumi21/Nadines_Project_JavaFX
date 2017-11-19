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

    private Connection connection = null;

    public ProximiteDAO() {
        this.connection = Accesseur.getConnection();
    }

    public static ProximiteDAO getInstance(){
        if (instance == null) instance = new ProximiteDAO();
        return instance;
    }

   /* public List<Proximite> listerProximites(String dateDebut, String dateFin){
        List<Proximite> listedesProximites = new ArrayList<Proximite>();

        Statement requeteListeProximites = null;
        try {
            requeteListeProximites = connection.createStatement();
            ResultSet curseurParc = requeteListeProximites.executeQuery("SELECT * FROM parc");

            //System.out.println("avant");
            while(curseurParc.next())
            {
                int id = curseurParc.getInt("id_parc");
                String nom = curseurParc.getString("nom");
                String pays = curseurParc.getString("pays");
                int nbr_montagne = curseurParc.getInt("nbr_montagne");
                int creation = curseurParc.getInt("creation");

                Parc parc = new Parc(nom);
                parc.setIdParc(id);
                parc.setPays(pays);
                parc.setNbre_montagne(nbr_montagne);
                parc.setCreation(creation);

                listedesParcs.add(parc);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //System.out.println("apres");

        System.out.println(listedesParcs);
        return listedesParcs;
    }*/



    public List<Proximite> CreerListeProximite(Proximite proximite){
        if (listeProximite == null){
            listeProximite = new ArrayList<Proximite>();
        }

        listeProximite.add(proximite);
        return listeProximite;
    }
}
