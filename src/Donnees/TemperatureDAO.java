package Donnees;

public class TemperatureDAO {

    private static TemperatureDAO instance;

    public static TemperatureDAO getInstance(){
        if (instance == null) instance = new TemperatureDAO();
        return instance;
    }
}
