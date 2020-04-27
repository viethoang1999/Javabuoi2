package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Excercise3_Min2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập vào phần tử mảng: ");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.printf("a[%d]",i);
            arr[i]=scanner.nextInt();
        }
        System.out.println("Lenght: "+n);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]+"");
        }
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int indexmin1=-1;
        int indexmin2=-1;
        for (int i = 0; i <n ; i++) {
            if (arr[i]<min1){
                min1=arr[i];
                indexmin1=i;
            }
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]<min2&&arr[i]>min1){
                min2=arr[i];
                indexmin2=i;
            }
        }
        if(indexmin1==-1){
            System.out.println("Không tìm thấy giá trị nhỏ nhất!");
        }
        else if(indexmin2==-1){
            System.out.println("KHông tìm thấy giá trị min 2!");
        }else {
            System.out.printf("min1= %d,indexmin1=%d\n",min1,indexmin1);
            System.out.printf("min2= %d,indexmin2=%d",min2,indexmin2);
        }
    }
}
