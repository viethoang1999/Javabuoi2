package OPPbuoi2;

public class Testnv {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement(2);
        employeeManagement.printAllEmployeeInformation();
        Employee highest = employeeManagement.findEmployeeHighestSalary();
        System.out.println("\nNhân viên có lương cao nhất là: " + highest + " với mức lương: " + highest.calculateSalary());

        Employee lowest = employeeManagement.findEmployeeLowsSalary();
        System.out.println("Nhân viên có lương thấp nhát là: " + lowest + "với mức lương: " + lowest.calculateSalary());
    }
}
