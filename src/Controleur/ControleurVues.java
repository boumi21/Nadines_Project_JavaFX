package Controleur;

import Vues.VueMenuPrincipal;

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


}
