package NhanVien;

import java.util.Scanner;

public class EmployManagement {
    private int n;
    private Employee[] employees;

    public EmployManagement(int n){
        this.n=n;
        this.employees=new Employee[n];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào thông tin "+n+" nhân viên ");
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập thông tin cho nhân viên fulltime , khi nhập fulltime. nập thông tin cho viên viên parttime mếu nhập chữ parttime");
            String employtype= scanner.nextLine();
            if (employtype.equals("fulltime")){
                System.out.println("Nhập thông tin cho nhân viên fulltime: ");
            }else if (employtype.equals("partime")){
                System.out.println("nhập thông tin cho nhân viên partime: ");
            }
            System.out.print("\t -Tên: ");
            String name=scanner.nextLine();

            System.out.print("\t -Tuổi: ");
            int age=scanner.nextInt();
            scanner.nextLine();

            System.out.print("\t -cmtnd: ");
            String id=scanner.nextLine();

            if (employtype.equals("fulltime")){
                System.out.print("\t -Số ngày làm việc: ");
                int WookingDay=scanner.nextInt();
                scanner.nextLine();

                System.out.print("\t -Lương theo ngày làm việc: ");
                long dailySalary=scanner.nextLong();
                scanner.nextLine();

                employees[i]=new FulltimeEmployee(name,age,id,WookingDay,dailySalary);

            }else if (employtype.equals("parttime")){
                System.out.print("\t -số ca làm việc: ");
                int WorkingShif=scanner.nextInt();
                scanner.nextLine();

                System.out.print("\t -lương làm việc theo ca: ");
                long baseSalary=scanner.nextLong();
                scanner.nextLine();

                employees[i]=new ParttimeEployee(name,age,id,WorkingShif,baseSalary);

            }
        }
        scanner.close();
    }
   public Employee findEmployeeHightSalary(){
        Employee Hight=employees[0];
       for (int i = 0; i <n ; i++) {
           if (Hight.caculateSalary()>employees[i].caculateSalary()) {
              Hight=employees[i];
           }
       }
       return Hight;
   }
   public Employee findEmployeeLowsSalary(){
        Employee Lows=employees[0];
       for (int i = 0; i <n ; i++) {
           if (Lows.caculateSalary()<employees[i].caculateSalary()){
               Lows=employees[i];
           }
       }
       return Lows;
   }
   public void pirnf(){
       System.out.println("có "+n+"nhân viên ");
       for (int i = 0; i <n ; i++) {
           System.out.println("nhân viên thứ"+(i+1)+":"+employees[i].toString());
       }
   }
}
