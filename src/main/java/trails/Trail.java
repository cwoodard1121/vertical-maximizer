package trails;

import java.util.ArrayList;

public interface Trail {

    public double length();

    public double vertical();

    public double avgPitch();

    public double maxPitch();

    public double uphill();

    public boolean flats();

    public ArrayList<Trail> getTributaries();

    public ArrayList<Trail> getOutflows();


}
