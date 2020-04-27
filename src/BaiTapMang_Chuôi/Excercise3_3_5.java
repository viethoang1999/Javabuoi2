package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Excercise3_3_5 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập mảng: ");
        int n = scanner.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Lenght: " + n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i <n ; i++) {
            if (arr[i]<0){
               arr[i]=0;

            }
        }
        System.out.println("mang sau khi sua: ");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+"");
        }
    }

}
