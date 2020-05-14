package OPP;

import java.util.Scanner;

public class TestStudentM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = scanner.nextInt();
        Studentmanagement studentmanagements = new Studentmanagement(n);
        System.out.println("Tổng số sinh viên đỗ: " + studentmanagements.count(true));
        System.out.println("Tổng số sinh viên trượt: " + studentmanagements.count(false));
        System.out.println("Thông tin sinh viên có điểm số cao nhất: " + studentmanagements.getbestStudent());
        System.out.println("Thông tin sinh viên có điểm số thấp nhất: " + studentmanagements.getworstStudent());


    }
}

