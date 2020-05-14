package OPPbuoi2;

import java.util.Scanner;

public class EmployeeManagement {
    private int n;
    private Employee[] employees;

    public EmployeeManagement(int n) {
        this.n = n;
        this.employees = new Employee[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin nhân viên: " + n + " nhân viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ": ");
            System.out.println("Nhập vào số 0 nếu bạn muốn nhập thoogn tin cho nhân viên fulltime,ngược lại nhập số 1  nếu bạn muốn nhập thông tin cho nhân viên parttime ");
            int employeeType = scanner.nextInt();
            scanner.nextLine();
            if (employeeType == 0) {
                System.out.println("Nhập thông tin cho nhân viên fulltime");
            } else {
                System.out.println("Nhập thông tin cho nhân viên parttime");
            }
            System.out.println("\t- Tên: ");
            String name = scanner.nextLine();

            System.out.println("\t- tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\t- Cmtnd: ");
            String id = scanner.nextLine();

            if (employeeType == 0) {
                System.out.println("\t  +Số ngày làm việc: ");
                int workingDay = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\t   +Lương theo ngày: ");
                long salary = scanner.nextLong();
                scanner.nextLine();

                employees[i]=new FulltimeEmployee(name,age,id,workingDay,salary);

            } else {
                System.out.println("\t   +Số ca làm việc: ");
                int ca = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\t   +Lương theo ca: ");
                long lgca = scanner.nextLong();
                scanner.nextLine();
                employees[i]=new PartTimeEmployee(name,age,id,ca,lgca);
            }
        }
        scanner.close();
    }
    public Employee findEmployeeHighestSalary(){
        Employee highest =employees[0];
        for (int i = 0; i <n ; i++) {
            if (highest.calculateSalary()<employees[i].calculateSalary()){
                highest=employees[i];
            }

        }
        return highest;
    }
    public Employee findEmployeeLowsSalary(){
        Employee Lows =employees[0];
        for (int i = 0; i <n ; i++) {
            if (Lows.calculateSalary()>employees[i].calculateSalary()){
                Lows=employees[i];
            }

        }
        return Lows;
    }
 public void printAllEmployeeInformation(){
     System.out.println("Có "+n+" nhân viên: ");
     for (int i = 0; i <n ; i++) {
         System.out.println("Nhân viên thứ: "+(i+1)+":"+employees[i].toString());
     }
 }

}
