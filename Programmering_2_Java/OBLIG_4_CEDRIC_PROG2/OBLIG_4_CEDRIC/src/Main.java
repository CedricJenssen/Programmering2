import no.hiof.cedricj.models.CelestialBody;
import no.hiof.cedricj.models.Planet;
import no.hiof.cedricj.models.PlanetSystem;
import no.hiof.cedricj.models.Star;
import no.hiof.cedricj.tools.StarCSVFileHandler;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        Star sun = new Star("Sun", 1.0, 1.0, 5777);

        PlanetSystem solarSystem = new PlanetSystem("Solar System", sun);

        Planet Mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88, sun);
        solarSystem.addPlanet(Mercury);
        Planet Venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225, sun);
        solarSystem.addPlanet(Venus);
        Planet Earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365, sun);
        solarSystem.addPlanet(Earth);
        Planet Mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687, sun);
        solarSystem.addPlanet(Mars);
        Planet Jupiter = new Planet("Jupiter",1.0, 1.0, 5.20440, 0.049, 4380, sun);
        solarSystem.addPlanet(Jupiter);
        Planet Saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585, sun);
        solarSystem.addPlanet(Saturn);
        Planet Uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773,  19.2184, 0.046, 30660, sun);
        solarSystem.addPlanet(Uranus);
        Planet Neptune = new Planet("Neptune",0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);
        solarSystem.addPlanet(Neptune);

        System.out.println(solarSystem);
        System.out.println();

        ArrayList<CelestialBody> planetListe = new ArrayList<>();
        planetListe.add(Mercury);
        planetListe.add(Venus);
        planetListe.add(Earth);
        planetListe.add(Mars);
        planetListe.add(Jupiter);
        planetListe.add(Saturn);
        planetListe.add(Uranus);
        planetListe.add(Neptune);

        System.out.println("Usortert");
        for (CelestialBody planet: planetListe){
            System.out.println(planet);
        }

        System.out.println();

        Collections.sort(planetListe);

        System.out.println("Sortert");
        for (CelestialBody planet: planetListe){
            System.out.println(planet);
        }

        System.out.println();

        ArrayList<PlanetSystem> SystemListe = new ArrayList<>();
        SystemListe.add(solarSystem);

        System.out.println(SystemListe);

        Collections.sort(SystemListe);

        for (PlanetSystem system: SystemListe){
            System.out.println(system);
        }

        System.out.println();

        Star Sun = new Star("Sun", 1.0, 1.0, 5777.0);
        Star MU_Cas = new Star("Mu Cas", 4.192, 4.657, 14750.0);
        Star V69_47 = new Star("V69-47", 1.316, 0.876, 5945.0);
        Star YZ_Cas = new Star("YZ Cas", 2.547, 2.308, 9200.0);
        Star NGC188 = new Star("NGC188", 1.425, 1.102, 5900.0);
        Star zet_Phe = new Star("zet Phe", 2.853, 3.922, 14550.0);


        ArrayList<Star> stjerneListe = new ArrayList<>();

        stjerneListe.add(Sun);
        stjerneListe.add(MU_Cas);
        stjerneListe.add(V69_47);
        stjerneListe.add(YZ_Cas);
        stjerneListe.add(NGC188);
        stjerneListe.add(zet_Phe);


        File file = new File("StjerneListe.csv");

        StarCSVFileHandler StarCSVFileHandler = new StarCSVFileHandler();

        StarCSVFileHandler.writeObjectsToFile(stjerneListe, file);

        System.out.println(StarCSVFileHandler.readObjectsFromFile(file));
    }
}
