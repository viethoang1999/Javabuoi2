package NhanVien;

public class Testnv {
    public static void main(String[] args) {
        EmployManagement employManagement=new EmployManagement(2);
        employManagement.pirnf();
        Employee Hight=employManagement.findEmployeeHightSalary();
        System.out.println("NHân viên có mức lương cao nhất là: "+Hight+"với mức lương"+Hight.caculateSalary());

        Employee Lows=employManagement.findEmployeeLowsSalary();
        System.out.println("Nhân viên có mức lương thấp nhất là: "+Lows+" với mức lương"+Lows.caculateSalary());
    }
}
