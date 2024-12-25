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


}
