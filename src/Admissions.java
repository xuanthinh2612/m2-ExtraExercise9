import java.util.List;
import java.util.Scanner;

public class Admissions {

    public void add(List<Student> list,Student student){
        list.add(student);
    }
    public Student showInfo(String identificationNumber,List<Student> list){
        for (Student s : list){
            if (s.getIdentificationNumber().equals(identificationNumber)) {
                return s;
            }
        }
        return null;
    }
    public boolean find(String identificationNumber,List<Student> list){
        for (Student s : list){
            if (s.getIdentificationNumber().equals(identificationNumber)) {
                return true;
            }
        }
        return false;

    }
}
