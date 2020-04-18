package buoi3;

import java.util.Scanner;

public class Activity2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập câu lệnh");
        String s=scanner.nextLine();
        if (s.equals("plus plus academy")) {
            System.out.println("chào mừng bạn đến với học viện");
        }else {
            System.out.println("mời bạn đăng nhập lại");
        }
    }
}
