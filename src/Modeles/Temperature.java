package Modeles;

public class Proximite {
    protected float degres;
    protected String date;

    public Temperature(){

    }

    public Temperature(float degres, String date){
        this.degres = degres;
        this.date = date;
    }

    public float getDegres() {
        return degres;
    }

    public void setDegres(float degres) {
        this.degres = degres;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
