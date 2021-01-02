public class GroupC extends Student {
    private double Literature;
    private double history;
    private double geography;
    public GroupC() {
    }

    public GroupC(String identificationNumber, String name, String address, int district, double literature, double history, double geography) {
        super(identificationNumber, name, address, district);
        Literature = literature;
        this.history = history;
        this.geography = geography;
    }

    public double getLiterature() {
        return Literature;
    }

    public void setLiterature(double literature) {
        Literature = literature;
    }

    public double getHistory() {
        return history;
    }

    public void setHistory(double history) {
        this.history = history;
    }

    public double getGeography() {
        return geography;
    }

    public void setGeography(double geography) {
        this.geography = geography;
    }

    @Override
    public String toString() {
        return super.toString() +
                "GroupC{" +
                "Literature=" + Literature +
                ", history=" + history +
                ", geography=" + geography +
                '}';
    }
}
