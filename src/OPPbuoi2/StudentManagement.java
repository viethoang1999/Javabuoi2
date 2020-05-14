package OPPbuoi2;

import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;

    public StudentManagement(int n) {
        this.n = n;

        Scanner scanner = new Scanner(System.in);
        students = new Student[n];
        System.out.println("Nhập thông tin cho" + n + " sinh viên ");
        for (int i = 0; i < n; i++) {
            System.out.println("- Sinh viên thứ" + (i + 1) + ":");
            System.out.println("\t+name: ");
            String name = scanner.nextLine();
            System.out.println("\t+gpa: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();//kí tự xuống dòng
            students[i] = new Student(name, gpa);
        }
        scanner.close();// tránh dò rỉ bộ nhớ
    }

    public void showAllStudentInformation() {
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thứ: " + (i + 1) + students[i].displayInformation());
        }
    }

    public int countStudent(boolean isPassed) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (isPassed) {
                if (students[i].check()) {
                    sum++;
                }
            } else {
                if (!students[i].check()) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public Student findBestStudent() {
        Student bestStudent = students[0];
        for (int i = 0; i < n; i++) {
            if (students[i].getgpa() > bestStudent.getgpa()) ;
            bestStudent = students[i];
        }
        return bestStudent;
    }

    public Student fintWorstStudent() {
        Student worstStudent = students[0];
        for (int i = 0; i < n; i++) {
            if (students[i].getgpa() < worstStudent.getgpa()) ;
            worstStudent = students[i];
        }
        return worstStudent;
    }


    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement(2);
        studentManagement.showAllStudentInformation();
        System.out.println("Tổng số sinh viên đỗ: " + studentManagement.countStudent(true));
        System.out.println("Tổng số sinh viên trượt: " + studentManagement.countStudent(false));
        System.out.println("Sinh viên có số điểm cao nhất: " + studentManagement.findBestStudent().displayInformation());
        System.out.println("Sinh viên có số diểm cao nhất: " + studentManagement.fintWorstStudent().displayInformation());
    }
}
