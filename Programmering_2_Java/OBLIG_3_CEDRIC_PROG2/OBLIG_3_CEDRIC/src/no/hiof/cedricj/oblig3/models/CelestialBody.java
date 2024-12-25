package no.hiof.cedricj.oblig3.models;

public abstract class CelestialBody {

    public String name;
    public double radius;
    public double mass;

    static final double mjup = 1.898E27;
    static final double rjup = 71_492;
    static final double msun = 1.98892E30;
    static final double rsun = 695_700;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public CelestialBody() {
    }

    public abstract double getRadiusInKm();

    public abstract double getMassInKg();

    public double getSurfaceGravity() {
        return (6.67408E-11 * getMassInKg()) / Math.pow(getRadiusInKm()*1000, 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

}
