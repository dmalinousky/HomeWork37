public class Stop {
    private Integer busAmount;
    private String title;

    public Stop(Integer busAmount, String title) {
        this.busAmount = busAmount;
        this.title = title;
    }

    public Integer getBusAmount() {
        return busAmount;
    }

    public void setBusAmount(Integer busAmount) {
        this.busAmount = busAmount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
