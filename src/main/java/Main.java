import constants.Constants;
import resort.Resort;
import resort.TrailRegistry;
import trails.Intersection;
import trails.Trail;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        loadConstants();
    }

    public static void loadConstants() {



        // TEST CASES
        final Trail dog_sled = new Trail("dog_sled");
        dog_sled.flats = true;
        dog_sled.uphill = 0;
        dog_sled.vertical = 88;
        dog_sled.maxPitch = 15;
        dog_sled.avgPitch = 5;
        dog_sled.length = 600;


        final Trail hogs_back = new Trail("hogs_back");
        hogs_back.flats = true;
        hogs_back.uphill = 2;
        hogs_back.maxPitch = 26;
        hogs_back.avgPitch = 15;
        hogs_back.vertical = 155;
        hogs_back.length = 700;
        Intersection intersection = new Intersection(hogs_back);
        intersection.computeResultingTrails();



        TrailRegistry tempRegistry = new TrailRegistry(hogs_back);
        Resort blue_mountain = new Resort("blue mountain",tempRegistry);
        Constants.resorts.put("blue mountain",blue_mountain);

    }
}
