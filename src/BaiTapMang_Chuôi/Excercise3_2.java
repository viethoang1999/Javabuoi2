package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Excercise3_2 {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Nhap phan tu mang 1: ");
        int n= scanner.nextInt();
        int[] arr1=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("arr1["+i+"]= ");
            arr1[i]=scanner.nextInt();
        }
        System.out.println("lenght arr1: "+n);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr1[i]+ "  ");
        }
        System.out.print(" Nhap phan tu mang 2: ");
        int m= scanner.nextInt();
        int[] arr2=new int[m];
        for (int i = 0; i <m ; i++) {
            System.out.print("arr2["+i+"]= ");
            arr2[i]=scanner.nextInt();
        }
        System.out.print("lenght arr2: ");
        for (int i = 0; i < m; i++) {
            System.out.println(arr2[i]+ "  ");
        }
        int arr3[]=new int[arr1.length+arr2.length];
        int count=0;
        for (int i = 0; i <n ; i++) {
            arr3[i]=arr1[i];
            count++;
        }
        for (int j = 0; j <m ; j++) {
            arr3[count++]=arr2[j];
        }
        System.out.println("Do dai mang 3 :" +arr3.length);
        System.out.println("Cac phan tu cua 2 mang: ");
        for (int i = 0; i <arr3.length ; i++) {
            System.out.println("a["+i+"]="+arr3[i]);
        }
    }
}
