package Modeles;

public class Temperature {
    protected int id;
    protected float degres;
    protected String date;

    public Temperature(){

    }

    public Temperature(int id, float degres, String date){
        this.degres = degres;
        this.date = date;
    }

    public Temperature(float degres, String date){
        this.degres = degres;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
