package Buoi4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Mời bạn nhập a : ");
        int a = scanner.nextInt();
        System.out.println("Mời bạn nhập b : ");
        int b = scanner.nextInt();
        int div=0;
        for (int i = 0; i <a;i++) {
           div+=b;
        }
        System.out.println("div = "+div);
    }

}
