import java.util.ArrayList;

public class PlanetSystem {

    private String name;
    private String centerStar;
    private ArrayList planets;

    public PlanetSystem(String name, String centerStar, double mass) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    @Override
    public String toString() {
        return("Planetsystem: " + name + " centerStar: " +
                centerStar + " planeter: " + planets);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(String centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList planets) {
        this.planets = planets;
    }
}
