package Store;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng cửa hàng:");
        int n = scanner.nextInt();*/
        StoreManagement storeManagement = new StoreManagement(2);
        storeManagement.prinf();
    }
}
