package P13;

public class Student {
    public String nim, name, className;
    double gpa;

    public Student() {

    }

    public Student(String nm, String nama, String kls, double ipk) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ipk;
    }

    public void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}