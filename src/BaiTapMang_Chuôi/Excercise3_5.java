package BaiTapMang_Chuôi;

import java.util.Scanner;

public class Excercise3_5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String chuoi=scanner.nextLine();
        System.out.println("chuỗi: "+chuoi);
        String chuoinguoc="";
        for (int i = chuoi.length()-1; i >=0 ; i--) {
            chuoinguoc=chuoinguoc+chuoi.charAt(i);

        }
        System.out.println("chuỗi sau khi đảo: " +chuoinguoc);
    }
}
