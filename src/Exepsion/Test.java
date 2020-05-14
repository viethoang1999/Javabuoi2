package Exepsion;

public class Test {
    private String messeage;


    public Test(){
        SmartScaner scaner=new SmartScaner();
        this.messeage=scaner.nextLine("Thông báo:");
        scaner.close();

    }

    public static void main(String[] args) {
        System.out.println(new Test());
    }
}
