package trails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Trail {

    public String trailName;
    public double length;
    public double vertical;
    public double startingElevation;
    public double endingElevation;
    public double avgPitch;
    public double maxPitch;
    public double uphill;
    public boolean flats;
    public ArrayList<Intersection> intersections = new ArrayList<>();
    public ArrayList<Trail> tributaries;
    public ArrayList<Trail> outflows;



    public Trail(String trailName) {
        this.trailName = trailName;
    }


    /**
     * Run this method ONLY when data has been filled
     */

    public double length() {
        return length;
    }

    public double vertical() {
        return vertical;
    }

    public double avgPitch() {
        return avgPitch;
    }

    public double maxPitch() {
        return maxPitch;
    }

    public double uphill() {
        return uphill;
    }

    public boolean flats() {
        return flats;
    }

    public double topElevation() {
        return startingElevation;
    }

    public double base() {
        return endingElevation;
    }

    public ArrayList<Trail> getTributaries() {
        return tributaries;
    }

    public ArrayList<Trail> getOutflows() {
        return outflows;
    }

}
