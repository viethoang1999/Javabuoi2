package Store;

import java.util.Scanner;

public class Store  {
    private String name;
    private String address;
    private int n;
    private SmartPhone[] phones;

    public Store() {

    }

    public Store(int index) {
        Scanner scanner = new Scanner(System.in);
        phones = new SmartPhone[index];
        System.out.println("-Nhập thông tin cửa hàng thứ " + index + ".");

            System.out.println("\t-Tên cửa hàng: ");
            String name = scanner.nextLine();

            System.out.println("\t-Địa chỉ cửa hàng: ");
            String address = scanner.nextLine();

            System.out.println("\t-Số lượng điện thoại có trong cửa hàng: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            this.phones=new SmartPhone[n];
        for (int i = 0; i < n; i++) {
            this.phones[i] = new SmartPhone(i+1);
        }

    }


    public Store(String name, String address, int n, SmartPhone[] phones) {
        this.name = name;
        this.address = address;
        this.n = n;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public SmartPhone[] getSmartPhones() {
        return phones;
    }

    public void setSmartPhones(SmartPhone[] smartPhones) {
        this.phones = smartPhones;
    }

    public int tongsodienthoaibanduoc() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += phones[i].getTotalSold();
        }
        return sum;
    }

    public long tongdoanhthu() {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += phones[i].getPrice() * phones[i].getTotalSold();
        }
        return sum;
    }

    public void prinf(int i) {
        System.out.println("Thông tin cửa hàng thứ " + (i + 1));
        System.out.println("\t Tên cửa hàng: " + name);
        System.out.println("\t Địa chỉ cửa hàng: " + address);
        System.out.println("\t Số luowjng điện thoại trong cửa hàng: " + n);
        System.out.println("\t Thông tin điện thoại trong cửa hàng: ");
        for (int j = 0; j < n; j++) {
            phones[j].prinf(j + 1);
        }
    }

}

