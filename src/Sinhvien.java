import java.util.Scanner;

public class Sinhvien {
    private String name;
    private int age;

    public Sinhvien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên:");
        this.name = scanner.nextLine();
        do {
            try {
                System.out.print("Nhập vào tuổi:");
                this.age = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                this.age = -1;
                String s=scanner.nextLine();
                System.out.println("bạn nhập ký tự sai"+s+"Mời bạn nhập lại!");
            }
        } while (this.age <= 0);
    }
    @Override
    public String toString() {
        return "Sinhvien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
   /* public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public static void main(String[] args) {
        System.out.println(new Sinhvien());
    }
}
