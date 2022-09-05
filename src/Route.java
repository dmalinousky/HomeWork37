import java.util.ArrayList;

public class Route {
    private ArrayList<Stop> stops;

    public Route() {}

    public Route(ArrayList<Stop> stops) {
        this.stops = stops;
    }

    public ArrayList<Stop> getStops() {
        return stops;
    }

    public void setStops(ArrayList<Stop> stops) {
        this.stops = stops;
    }
}
