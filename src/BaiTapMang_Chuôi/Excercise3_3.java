package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Excercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap độ dài mảng: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxindex = i;
            }
        }
        int min = arr[0];
        int minindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minindex = i;
            }

        }
        System.out.printf("Giá trị lớn nhất là= %d ,Maxindex=%d\n", max, maxindex);
        System.out.printf("Giá trị nhỏ nhất là= %d,Minindex=%d", min, minindex);
    }
}
