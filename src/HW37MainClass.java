import java.util.ArrayList;

public class HW37MainClass {


    public static void main(String[] args) throws InterruptedException {
        // Route creating
        Route route1 = new Route();
        Stop route_1_Stop_1 = new Stop(3, "point #1");
        Stop route_1_Stop_2 = new Stop(3, "point #2");
        Stop route_1_Stop_3 = new Stop(1, "point #3");
        Stop route_1_Stop_4 = new Stop(2, "point #4");
        Stop route_1_Stop_5 = new Stop(2, "point #5");
        Stop route_1_Stop_6 = new Stop(2, "point #6");
        ArrayList<Stop> route_1_stops = new ArrayList<>();
        route_1_stops.add(route_1_Stop_1);
        route_1_stops.add(route_1_Stop_2);
        route_1_stops.add(route_1_Stop_3);
        route_1_stops.add(route_1_Stop_4);
        route_1_stops.add(route_1_Stop_5);
        route_1_stops.add(route_1_Stop_6);
        route1.setStops(route_1_stops);

        // Bus creating
        Bus bus1 = new Bus("Bus-1", 700, route1);
        Bus bus2 = new Bus("Bus-2", 1000, route1);
        Bus bus3 = new Bus("Bus-3", 700, route1);
        Bus bus4 = new Bus("Bus-4", 800, route1);
        Bus bus5 = new Bus("Bus-5", 700, route1);

        bus1.start();
        bus2.start();
        bus3.start();
        bus4.start();
        bus5.start();
    }
}
