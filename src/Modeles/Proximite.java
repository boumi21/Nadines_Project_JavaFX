package Modeles;

public class Proximite {

    protected int id;
    protected float valeurProximite;
    protected String date;

    public Proximite(){

    }

    public Proximite(int id, float valeurProximite, String date) {
        this.id = id;
        this.valeurProximite = valeurProximite;
        this.date = date;
    }

    public Proximite(float valeurProximite, String date) {
        this.valeurProximite = valeurProximite;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
