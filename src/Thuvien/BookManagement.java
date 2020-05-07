package Thuvien;

import java.util.Scanner;

public class BookManagement {
    private int n;
    private Book[] books;

    public BookManagement(int n){
        this.n=n;
        Scanner scanner=new Scanner(System.in);
        books=new Book[n];
        System.out.println("Nhap thong tin cho "+n+"sinh vien.");
        for (int i = 0; i <n ; i++) {
            System.out.println("-Quyen sach thu"+(i+1)+":");
            System.out.println("\t +name: ");
            String name=scanner.nextLine();
            System.out.println("\t +Author: ");
            String author=scanner.nextLine();
            System.out.println("\t +price: ");
            long priec=scanner.nextLong();
            scanner.nextLine();
            System.out.println("\t +totalSold: ");
            long totalSold=scanner.nextLong();
            scanner.nextLine();
            books[i]=new Book(name,author,priec,totalSold);
        }
        scanner.close();
    }
     public int countBestseller(boolean isPassed){
        int sum=0;
         for (int i = 0; i <n ; i++) {
             if (isPassed){
                 if (books[i].check()){
                     sum++;
                 }
             }
         }
         return sum;
     }
     public Book bestmaxBook(){
        Book maxBook=books[0];
         for (int i = 0; i <n ; i++) {
             if (books[i].getTotalSold()>maxBook.getTotalSold()){
                 maxBook=books[i];
             }
         }
         return maxBook;
     }
     public void  allBook(){
         for (int i = 0; i <n ; i++) {
             System.out.println("Cuon sach 1: "+(i+1)+books[i].showBook());
         }
     }
}
