package Modeles;

public class Temperature {
    protected float valeurTemperature;
    protected String date;

    public Temperature(float valeurTemperature, String date) {
        this.valeurTemperature = valeurTemperature;
        this.date = date;
    }


    public float getValeurTemperature() {
        return valeurTemperature;
    }

    public void setValeurTemperature(float degres) {
        this.valeurTemperature = degres;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
