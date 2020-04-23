package buoi3;

import java.util.Scanner;

public class Bangcuuchuong {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập n : ");
        int n=scanner.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i+"*"+n+"="+(i*n));
        }

    }
}
