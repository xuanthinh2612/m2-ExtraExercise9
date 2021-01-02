public class Student {
    private String identificationNumber;
    private String name;
    private String address;
    private int district;

    public Student() {
    }

    public Student(String identificationNumber, String name, String address, int district) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.address = address;
        this.district = district;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Student{" +
                "identificationNumber='" + identificationNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", district=" + district +
                '}';
    }
}
