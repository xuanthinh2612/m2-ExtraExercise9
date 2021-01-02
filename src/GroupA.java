public class GroupA extends Student {
    private double math;
    private double chemical;
    private double physical;

    public GroupA() {
    }

    public GroupA(String identificationNumber, String name, String address, int district, double math, double chemical, double physical) {
        super(identificationNumber, name, address, district);
        this.math = math;
        this.chemical = chemical;
        this.physical = physical;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getChemical() {
        return chemical;
    }

    public void setChemical(double chemical) {
        this.chemical = chemical;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    @Override
    public String toString() {
        return super.toString() +
                "GroupA{" +
                "math=" + math +
                ", chemical=" + chemical +
                ", physical=" + physical +
                '}';
    }
}
