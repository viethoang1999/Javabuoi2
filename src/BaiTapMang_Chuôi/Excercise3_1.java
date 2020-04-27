package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Excercise3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Mời bạn nhập độ dài mảng : ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] :");
            a[i] = scanner.nextInt();
        }
        System.out.println(" lenght :" + n);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + "  ");
        }
        int newlenght = 0;
        for (int i = 0; i < n; i++) {
            boolean existed = false;
            for (int j = 0; j < newlenght; j++) {
                if (a[i] == a[j]) {
                    existed = true;
                    break;
                }
            }
            if (!existed) {
                a[newlenght] = a[i];
                newlenght++;

            }
        }
        int b[] = new int[newlenght];
        System.out.println("lenght : " + newlenght);
        for (int i = 0; i < newlenght; i++) {
            b[i] = a[i];
            System.out.println(b[i] + " ");
        }

    }
}



