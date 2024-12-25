import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Star Sun = new Star("Sun", 1.0, 1.0, 5777);

        ArrayList<Planet> planets = new ArrayList<>();

        Planet Mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        planets.add(Mercury);

        Planet Venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        planets.add(Venus);
        Planet Earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        planets.add(Earth);
        Planet Mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        planets.add(Mars);
        Planet Jupiter = new Planet("Jupiter", 1.0, 1.0);
        planets.add(Jupiter);
        Planet Saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        planets.add(Saturn);
        Planet Uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        planets.add(Uranus);
        Planet Neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);
        planets.add(Neptune);

        System.out.println();
        System.out.println(Planet.toString());



        double rjup = 71492;
        double mjup = 1.898E27;
        double rsun = 695700;
        double msun = 1.98892E30;

        double radiuskm = Saturn.getRadius() * rjup;
        double masskg = Saturn.getMass() * mjup;

        System.out.println(radiuskm);
        System.out.println(masskg);

        double radiuskmsun = Sun.getRadius() * rsun;

        System.out.println(radiuskmsun);


    }

}
