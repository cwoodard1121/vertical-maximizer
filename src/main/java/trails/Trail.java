package trails;

import java.util.ArrayList;

public class Trail {

    public String trailName;
    public double length;
    public double vertical;
    public double avgPitch;
    public double maxPitch;
    public double uphill;
    public boolean flats;
    public ArrayList<Trail> tributaries;
    public ArrayList<Trail> outflows;



    public Trail(String trailName) {

    }

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

    public ArrayList<Trail> getTributaries() {
        return tributaries;
    }

    public ArrayList<Trail> getOutflows() {
        return outflows;
    }
}
