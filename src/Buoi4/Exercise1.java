package Buoi4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập n : ");
        int n = scanner.nextInt();
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

