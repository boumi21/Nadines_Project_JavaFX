package Donnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Accesseur {

    public static String BASEDEDONNEES_DRIVER = "org.postgresql.Driver";
    public static String BASEDEDONNEES_URL = "jdbc:postgresql://localhost:5432/Proximite";
    public static String BASEDEDONNEES_USAGER = "postgres";
    public static String BASEDEDONNEES_MOTDEPASSE = "casserole21";
    private static Connection connection = null;

    public Accesseur()
    {
    }

    public static Connection getConnection()
    {
        if(null == connection)
        {
            try {
                Class.forName(BASEDEDONNEES_DRIVER);
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(BASEDEDONNEES_URL, BASEDEDONNEES_USAGER, BASEDEDONNEES_MOTDEPASSE);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //connection.close();
        }
        return connection;
    }
}
