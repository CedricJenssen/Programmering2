import java.util.ArrayList;

import no.hiof.cedricj.oblig3.models.NaturalSatellite;
import no.hiof.cedricj.oblig3.models.Planet;
import no.hiof.cedricj.oblig3.models.PlanetSystem;
import no.hiof.cedricj.oblig3.models.Star;

public class Main {
    public static void main(String[] args) {

        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380, sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660, sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        PlanetSystem planetSystem = new PlanetSystem("Solar system", sun, planets);

        System.out.println(planetSystem);

        System.out.println();
        for (Planet planet : planetSystem.getPlanets()) {
            System.out.println(planet);
        }

        System.out.println();
        System.out.println("Saturn radius in Km: " + saturn.getRadiusInKm() + "\n" +
                "Saturn mass in kg: " + saturn.getMassInKg());

        System.out.println("Sun radius in km: " + sun.getRadiusInKm() +
                "\nSun mass in kg: " + sun.getMassInKg());

        System.out.println();
        System.out.println("Saturn surface gravity: " + saturn.getSurfaceGravity());
        System.out.println("Neptune surface gravity: " + neptune.getSurfaceGravity());

        System.out.println();
        System.out.println("Biggest planet in the solar system: " + planetSystem.getBiggestPlanet());
        System.out.println("Smallest planet in the solar system: " + planetSystem.getSmallestPlanet());

        System.out.println();
        System.out.println("Mars Mearth: " + mars.massInMearth());
        System.out.println("Mars Rearth: " + mars.radiusInRearth());

        System.out.println();
        System.out.println(earth.distanceToCentralBody(0));
        System.out.println(earth.distanceToCentralBody(90));
        System.out.println(earth.distanceToCentralBody(180));
        System.out.println(earth.distanceToCentralBody(270));
        System.out.println(earth.distanceToCentralBody(360));

        System.out.println();

    }
}
