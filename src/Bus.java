import java.util.ArrayList;

public class Bus extends Thread {
    private String busName;
    private Integer stopTime;
    private Route route;

    public Bus(String busName, Integer stopTime, Route route) {
        this.busName = busName;
        this.stopTime = stopTime;
        this.route = route;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public Integer getStopTime() {
        return stopTime;
    }

    public void setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public void run() {
        try {
            this.travel(this.getRoute());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void travel(Route route) throws InterruptedException {
        this.stopBus(getRoute(), getStopTime());
    }

    public void stopBus(Route route, Integer stopTime) throws InterruptedException {
        for (int i = 0; i < this.getRoute().getStops().size(); i++) {
            synchronized (route.getStops().get(i)) {
                if (this.getRoute().getStops().get(i).getBusAmount() == 0) {
                    try {
                        this.wait();
                    } catch (IllegalMonitorStateException exception) {}
                } else if (this.getRoute().getStops().get(i).getBusAmount() > 0) {
                    this.getRoute().getStops().get(i).setBusAmount(this.getRoute().getStops().get(i).getBusAmount() - 1);
                    System.out.println(getBusName() + " has arrived on " + this.getRoute().getStops().get(i).getTitle());
                    try {
                        this.wait(stopTime);
                    } catch (Exception exception) {}
                    this.getRoute().getStops().get(i).setBusAmount(this.getRoute().getStops().get(i).getBusAmount() + 1);
                    try {
                        route.notifyAll();
                    } catch (IllegalMonitorStateException exception) {}
                }
            }
        }
    }
}
