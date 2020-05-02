package OPP;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        int weight = scanner.nextInt();
        System.out.print("CHiều rộng: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(weight, height);
        System.out.println("Hiển thị chiều dai: " + rectangle.getWeight());
        System.out.println("Hiển thị chiều rộng: " + rectangle.getHeight());
        System.out.println("Chu vi: " + rectangle.getChuvi());
        System.out.println("Dien tich: " + rectangle.getDientich());
        System.out.println(rectangle.Check() ? "Hình vuông" : "Không là hình vuông");


    }

}
