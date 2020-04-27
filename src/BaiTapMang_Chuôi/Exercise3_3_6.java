package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Exercise3_3_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập vào phần tử n: ");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.printf("a[%d]",i);
            arr[i]=scanner.nextInt();
        }
        System.out.println("lenght: "+n);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+"");
        }
        int tmp=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
               if(arr[i]>arr[j]){
                   tmp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=tmp;
               }
            }
        }
        System.out.println("Mang sau khi sắp xếp: ");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+"");
        }
    }
}
