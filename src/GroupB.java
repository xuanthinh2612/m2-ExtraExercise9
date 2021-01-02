public class GroupB extends Student{

    private double math;
    private double chemical;
    private double biological;
    public GroupB() {
    }

    public GroupB(String identificationNumber, String name, String address, int district, double math, double chemical, double biological) {
        super(identificationNumber, name, address, district);
        this.math = math;
        this.chemical = chemical;
        this.biological = biological;
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

    public double getBiological() {
        return biological;
    }

    public void setBiological(double biological) {
        this.biological = biological;
    }

    @Override
    public String toString() {
        return super.toString() +
                "GroupB{" +
                "math=" + math +
                ", chemical=" + chemical +
                ", biological=" + biological +
                '}';
    }
}
