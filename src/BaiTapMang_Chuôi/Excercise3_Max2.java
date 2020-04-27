package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Excercise3_Max2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.print("Mời bạn nhập vào phần tử mảng: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d]= ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Lenght: "+arr.length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxindex1 =-1;
        int maxindex2 =-1;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i]>max1 ) {
                max1 = arr[i];
                maxindex1 = i;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
                maxindex2 = i;
            }
        }
        if (maxindex1 == -1) {
            System.out.println("Không tìm thấy giá trị lớn thứ nhất: ");
        } else if (maxindex2 == -1) {
            System.out.println("Không tìm thấy giá trị lớn thứ 2: ");
        } else {
            System.out.printf("max1= %d,maxindex1=%d\n", max1, maxindex1);
            System.out.printf("max2= %d,maxindex2=%d\n", max2, maxindex2);
        }

    }


}

