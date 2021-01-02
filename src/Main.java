import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        System.out.println("Menu");
        System.out.println("1.Them Hoc Sinh\n2.Tim kiem thong tin hoc sinh");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    add(list);
                    break;
                case 2:
                    findAndShow(list);
                    break;
                case 0:
                    System.exit(0);

            }
            System.out.println("1.Them Hoc Sinh\n2.Tim kiem thong tin hoc sinh");
            choice = scanner.nextInt();
        }


    }

    public static Student createStudent() {
        System.out.println("Ho va ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("So Bao Danh");
        String identificationNumber = scanner.nextLine();
        System.out.println("Dia Chi");
        String address = scanner.nextLine();
        System.out.println("Khu Vuc");
        int district = scanner.nextInt();
        Student student = new Student(identificationNumber, name, address, district);
        return student;
    }

    public static void add(List<Student> list) {
        System.out.println("Khoi thi : 1.A\t2.B\t3.C");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:

                Student student = createStudent();

                GroupA a=new GroupA();
                a.setName(student.getName());
                a.setDistrict(student.getDistrict());
                a.setAddress(student.getAddress());
                a.setIdentificationNumber(student.getIdentificationNumber());
                System.out.println("Diem toan");
                a.setMath(scanner.nextDouble());
                System.out.println("Diem ly");
                a.setPhysical(scanner.nextDouble());
                System.out.println("Diem hoa");
                a.setChemical(scanner.nextDouble());
                list.add(a);
                break;
            case 2:
                Student students = createStudent();
                GroupB b = new GroupB();
                b.setName(students.getName());
                b.setDistrict(students.getDistrict());
                b.setAddress(students.getAddress());
                b.setIdentificationNumber(students.getIdentificationNumber());

                System.out.println("Diem toan");
                b.setMath(scanner.nextDouble());
                System.out.println("Diem sinh");
                b.setBiological(scanner.nextDouble());
                System.out.println("Diem hoa");
                b.setChemical(scanner.nextDouble());
                list.add(b);
                break;
            case 3:
                Student studentC = createStudent();
                GroupC c = new GroupC();
                c.setName(studentC.getName());
                c.setDistrict(studentC.getDistrict());
                c.setAddress(studentC.getAddress());
                c.setIdentificationNumber(studentC.getIdentificationNumber());

                System.out.println("Diem van");
                c.setLiterature(scanner.nextDouble());
                System.out.println("Diem su");
                c.setHistory(scanner.nextDouble());
                System.out.println("Diem dia");
                c.setGeography(scanner.nextDouble());
                list.add(c);
                break;


        }

    }

    public static void findAndShow(List<Student> list) {
        System.out.println("Nhap SBD");
        scanner.nextLine();
        String key = scanner.nextLine();
        for (Student s : list) {
            if (s.getIdentificationNumber().equals(key)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("not found");
    }
}

