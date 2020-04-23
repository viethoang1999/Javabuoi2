package Buoi4;

import java.util.Scanner;

public class Excercise4 {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "mời bạn nhập n : ");
        int n =scanner.nextInt();
        int sum=0;
        float avg=0;
        for (int i=0;i<=n;i++){
            sum+=i;
        }
        avg=(float)(sum)/n;
        System.out.println("sum =" +sum);
        System.out.println("avg = " +avg);
    }
}
