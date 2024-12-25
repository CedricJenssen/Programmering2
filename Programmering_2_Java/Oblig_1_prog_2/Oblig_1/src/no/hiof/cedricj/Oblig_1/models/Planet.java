package no.hiof.cedricj.Oblig_1.models;

public class Planet {

    private String navn;
    private double radius;
    private double masse;

    public Planet(String navn, double radius, double masse) {
        this.navn = navn;
        this.radius = radius;
        this.masse = masse;
    }

    public void printBeskrivelse() {
        System.out.println("Planeten " + navn + " har en radius på " +
                radius + "km og en masse på " + masse + "kg.");
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

}
