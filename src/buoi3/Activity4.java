package buoi3;

import java.util.Scanner;

public class Activity4 {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời bạn nhập n");
        String n = scanner.nextLine();
        System.out.println( n+ "+"+n+n+"+"+n+n+n+"="+(Integer.parseInt(n)+Integer.parseInt(n+n)+Integer.parseInt(n+n+n)));

    }

}
