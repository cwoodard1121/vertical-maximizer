package constants;

import resort.Resort;
import trails.Trail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Constants {

    public static final HashMap<String,Resort> resorts = new HashMap<>();

    public static final class DistanceConstants {


    }

    public static final class TrailConstants {


        public static boolean METRIC_SYSTEM = true;





        /**
         * @param feet
         * Returns the amount of meters per foot supplied
         */
        public static double feetToMeters(double feet) {
            return feet * 0.304;
        }

        /**
         *
         * @param m meters
         * @return km
         * Returns the amount of meters
         */
        public static double metersToKilometers(double m) {
            return m / 1000;
        }

        //TODO: MAKE WORK
        public static Trail lookup(Resort r, String trailName) {
            return null;
        }



    }

}
