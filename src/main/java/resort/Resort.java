package resort;

public class Resort {
    private TrailRegistry trails;
    private String name;

    public Resort(String name) {
        this.name = name;
        trails = new TrailRegistry();
    }

    public Resort(String name, TrailRegistry autoFill) {
        this.name = name;
        this.trails = autoFill;
    }

    private TrailRegistry grab(String name) {
        //TODO: grab from json files
        return null;

    }
}
