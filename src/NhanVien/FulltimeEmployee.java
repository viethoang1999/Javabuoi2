package NhanVien;

public class FulltimeEmployee extends Employee{
    public static final long MEAL_ALLOWANCE=2000000;

    private int totalWorkingDay;
    private long dailySalary;

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDay;
    }

    public FulltimeEmployee(String name, int age, String identificationNumber, int totalWorkingDay, long dailySalary) {
        super(name, age, identificationNumber);
        this.totalWorkingDay = totalWorkingDay;
        this.dailySalary = dailySalary;
    }

    @Override
    public String toString() {
        return String.format("name: %s,age: %s,identificationNumber: %s,totalWorking: %s,dailySalary:%s",
                getName(),getAge(),getIdentificationNumber(),getWorkingCount(),getSalaryRate());
    }
}
