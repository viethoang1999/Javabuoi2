package Buoi4;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Mời bạn nhập n: ");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
