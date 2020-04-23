package buoi3;

import java.util.Scanner;

public class Activity6 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời bạn nhập n : ");
        for(int i=0;i<=10;i++){
            for (int j=0;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }
    }
}
