package no.hiof.cedricj.oblig3.models;

public class Star extends CelestialBody{
    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    @Override
    public double getRadiusInKm() {
        return radius * rsun;
    }

    @Override
    public double getMassInKg() {
        return mass * msun;
    }


    @Override
    public String toString() {
        return "The star " + name + " has a radius of " + radius +
                " Rsun, and a mass of " + mass + " Msun. It's effective temperature is " +
                effectiveTemp + " kelvin.";
    }


    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
