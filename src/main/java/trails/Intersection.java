package trails;

import java.util.stream.Stream;

public class Intersection {


    /**
     * 1. Trails are the trails that are involved in the intersection
     *
     * 2. Resulting trails are the trails that are still there after the intersection happens, meaning they continued
     *
     * 3. POIElevation is the elevation at the POI used in calculations to remove the vertical from the second run after the hypothetical skier connects to the run.
     */
    private Trail[] trails;
    private Trail[] resultingTrails;
    private int POIElevation;

    public Intersection(Trail... trails) {
        this.trails = trails;
        computeResultingTrails();
    }

    public Intersection computeResultingTrails() {
        resultingTrails = (Trail[]) Stream.of(trails).filter(trail -> (Math.max(trail.startingElevation,POIElevation) - Math.min(trail.startingElevation,POIElevation) < 10)).toArray();
        return this;
    }

    public Trail[] getResultingTrails() {
        return resultingTrails;
    }
}
