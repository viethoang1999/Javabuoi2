package Store;

import java.util.Scanner;

public class SmartPhone {
    private String Brand;
    private boolean hasbluetooth;
    private boolean has5g;
    private boolean haswifi;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold;

    public SmartPhone(int index){
        Scanner scanner=new Scanner(System.in);
        System.out.println("-Nhập vào thông tin của điện thoại thứ"+(index)+": ");
        System.out.println("\t -Tên hãng điện thoại:  ");
        String Brand=scanner.nextLine();
        System.out.println("\t Có bluetooth hay ko: ");
        boolean bluetooth=scanner.nextLine().equalsIgnoreCase("có");

        System.out.println("\t Có 5g hay khong: ");
        boolean has5g=scanner.nextLine().equalsIgnoreCase("có");

        System.out.println("\t Có wifi hay không: ");
        boolean wifi=scanner.nextLine().equalsIgnoreCase("có");

        System.out.println("\t Hệ điều hành: ");
        String os=scanner.nextLine();

        System.out.println("\t Bộ nhớ: ");
        float memory=scanner.nextFloat();
        scanner.nextLine();

        System.out.println("\t Màu: ");
        String color=scanner.nextLine();

        System.out.println("\t Giá: ");
        long price=scanner.nextLong();
        scanner.nextLine();

        System.out.println("\t Số bán được: ");
        int totalSold=scanner.nextInt();
        scanner.nextLine();
    }

    public SmartPhone() {

    }

    public SmartPhone(String Brand, boolean hasbluetooth, boolean has5g, boolean haswifi,
                      String os, float memory, String color, long price, int totalSold) {
        this.Brand = Brand;
        this.hasbluetooth = hasbluetooth;
        this.has5g = has5g;
        this.haswifi = haswifi;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
    }

    public SmartPhone(String name, String address, int n) {
    }

    public String getBrand() {
        return Brand;
    }

    public boolean getHasbluetooth() {
        return hasbluetooth;
    }

    public boolean getHas5g() {
        return has5g;
    }

    public boolean gethasWifi() {
        return haswifi;
    }

    public String getOs() {
        return os;
    }

    public float getMemory() {
        return memory;
    }

    public String getColor() {
        return color;
    }

    public long getPrice() {
        return price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setHasbluetooth(boolean hasbluetooth) {
        this.hasbluetooth = hasbluetooth;
    }

    public void setHas5g(boolean has5g) {
        this.has5g = has5g;
    }

    public void setHaswifi(boolean haswifi) {
        this.haswifi = haswifi;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "Brand='" + Brand + '\'' +
                ", hasbluetooth=" + hasbluetooth +
                ", has5g=" + has5g +
                ", haswifi=" + haswifi +
                ", os='" + os + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }

    public void  prinf(int i){
        System.out.println("\t-Thông tin điện thoại thứ "+i+": ");
        System.out.println("\t Tên hãng: "+Brand);
        System.out.println("\t Có blubetooth hay không: "+hasbluetooth);
        System.out.println("\t Có 5g hay không: "+has5g);
        System.out.println("\t Có wifi hay không: "+haswifi);
        System.out.println("\t Hệ điều hành: "+os);
        System.out.println("\t Bộ nhớ: "+memory);
        System.out.println("\t Màu: "+color);
        System.out.println("\t Giá: "+price);
        System.out.println("\t Số bán được: "+totalSold);
    }
}
