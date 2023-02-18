package resort;

import trails.Trail;

import java.util.HashMap;

public class TrailRegistry {
    private HashMap<String,Trail> trails = new HashMap<>();

    // default constructor
    public TrailRegistry(Trail... trails) {
        for(Trail t : trails) {
            this.trails.put(t.trailName.toLowerCase(),t);
        }
    }
}
