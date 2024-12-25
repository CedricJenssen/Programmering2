package no.hiof.cedricj.oblig3.models;


public class Planet extends NaturalSatellite {

    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);
    }

    @Override
    public double getRadiusInKm() {
        return radius * rjup;
    }

    @Override
    public double getMassInKg() {
        return mass * mjup;
    }

    public double radiusInRearth() {
        return getRadiusInKm()/6371;
    }

    public double massInMearth() {
        return getMassInKg()/5.972E24;
    }


    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody){
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    @Override
    public String toString() {
        return "The planet " + name + " has a radius of " + radius +
                " Rjup, and a mass of " + mass + " Mjup.";
    }

}

