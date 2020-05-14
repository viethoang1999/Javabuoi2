package Thuvien;

import java.util.Scanner;

public class TestThuVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        int n = scanner.nextInt();
        BookManagement bookManagement = new BookManagement(n);
        bookManagement.allBook();
        System.out.println("tong so ban nhieu nhat: " + bookManagement.countBestseller(true));
        System.out.println("cuon sach ban chay nhat: " + bookManagement.bestmaxBook().showBook());
    }
}
