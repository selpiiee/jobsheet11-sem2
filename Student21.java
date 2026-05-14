public class Student21 {
    String nim, name, className;
    double gpa;

    public Student21() {

    }
    
    public Student21(String nm, String nama, String kls, double ipk) {
        nim = nm;
        name = nama; 
        className = kls;
        gpa = ipk;
    }

    void print() {
        System.out.println(nim + " - " + name +" - " + className + " - " + gpa);
    }
}