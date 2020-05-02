package OPP;

public class Student {
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean Check() {
        return gpa >= 1.5f;
    }

    public String hienthiTen() {
        return ("name: " + name);
    }
    public  String hienthiGPA(){
        return ("gpa: "+gpa);
    }

}
