package buoi3;

import java.util.Scanner;

public class Activity5 {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));
        System.out.println(a+"mod"+b+"="+(a%b));
    }
}
