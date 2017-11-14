package Controleur;

import Vues.VueMenuPrincipal;

import java.sql.SQLException;

public class ControleurVues {
    protected static ControleurVues instance;
    private VueMenuPrincipal vueMenuPrincipal = null;

    public static ControleurVues getInstance()
    {
        if(instance == null) instance = new ControleurVues();
        return instance;
    }

    public void setVueMenuPrincipal(VueMenuPrincipal vueMenuPrincipal)
    {
        this.vueMenuPrincipal = vueMenuPrincipal;
    }


    public void actionProximite()
    {
        this.vueMenuPrincipal.construirePanneauProximite();
    }

    public void actionRetourEnArriere() throws SQLException
    {
        this.vueMenuPrincipal.construireMenuPrincipal();
    }


}
