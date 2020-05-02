package OPP;

import java.util.Scanner;

public class Studentmanagement {
    private int n;
    private Student students[];

    public Studentmanagement(int n) {
        this.n = n;
        students = new Student[n];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("-Nhập vào sinh viên thứ " + (i + 1) + ": ");
            System.out.print("\t+Tên: ");
            String name = scanner.nextLine();
            System.out.print("\t+GPA: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            students[i] = new Student(name, gpa);

        }

    }

    public int count(boolean Check) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Check) {
                count = count + (students[i].Check() ? 1 : 0);
            } else {
                count = count + (students[i].Check() ? 0 : 1);
            }
        }
        return count;
    }

    public Student getbestStudent() {
        if (n < 1) {
            return null;
        }
        Student beststudent = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].getGpa() > beststudent.getGpa()) {
                beststudent = students[i];
            }
        }
        return beststudent;
    }

    public Student getworstStudent() {
        if (n < 1) {
            return null;
        }
        Student worststudent = students[0];
        for (int i = 1; i < n; i++) {
            if ((students[i].getGpa() < worststudent.getGpa())) {
                worststudent = students[i];
            }
        }
        return worststudent;
    }

}

