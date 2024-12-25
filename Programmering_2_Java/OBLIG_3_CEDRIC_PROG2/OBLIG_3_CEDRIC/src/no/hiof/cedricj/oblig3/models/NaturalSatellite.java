package no.hiof.cedricj.oblig3.models;

import java.lang.Math;

public abstract class NaturalSatellite extends CelestialBody{

    public double semiMajorAxis;
    public double eccentricity;
    public double orbitalPeriod;
    public CelestialBody centralCelestialBody;

    private final double AU = 149_597_871;
    private static final double GC = 6.67408E-11;


    public NaturalSatellite(double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public NaturalSatellite(String name, double radius, double mass) {
        super(name, radius, mass);
    }

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public double distanceToCentralBody(double degrees){
        double distance = semiMajorAxis*(1 - Math.pow(eccentricity, 2)) / (1 + eccentricity * Math.cos(Math.toRadians(degrees)));
        return distance * AU;
    }

    public double orbitingVelocity(double distance){
        return Math.sqrt((GC * getMassInKg()) / (distance * 1000));
    }



    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }


}
