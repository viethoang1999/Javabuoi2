package Exepsion;

import java.util.Scanner;

public class SmartScaner {
    private Scanner scanner;

    public SmartScaner(){
        scanner=new Scanner(System.in);
    }
    public void close(){
        if (scanner!=null){
            scanner.close();
        }
    }
    public String nextLine(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
    public String nextLine(Scanner scanner,String message ){
        int maxLenght=0;
        int minLenght = 0;
        do {
            try {
                System.out.println();
                message=scanner.nextLine();
                scanner.nextLine();
            }catch (Exception e){
                String messages=scanner.nextLine();
                System.out.println("Bạn đã nhập sai mời bạn nhập lại"+messages);
            }

        }while (minLenght<10&&maxLenght>50);
        return message;
    }
}
