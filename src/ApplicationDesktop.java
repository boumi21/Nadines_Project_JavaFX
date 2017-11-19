import Donnees.Connection;
import Vues.VueMenuPrincipal;

public class ApplicationDesktop {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        //VueMenuPrincipal vueMenuPrincipal = new VueMenuPrincipal();
        //vueMenuPrincipal.launch(VueMenuPrincipal.class, args);
        new Connection().start();
    }
}
