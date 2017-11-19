package Modeles;

public class Proximite {

    protected float valeurProximite;
    protected String date;

    public Proximite(float valeurProximite, String date) {
        this.valeurProximite = valeurProximite;
        this.date = date;
    }

    public float getValeurProximite() {
        return valeurProximite;
    }

    public void setValeurProximite(float valeurProximite) {
        this.valeurProximite = valeurProximite;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
