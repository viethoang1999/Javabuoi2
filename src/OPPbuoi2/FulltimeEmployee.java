package OPPbuoi2;

public class FulltimeEmployee extends Employee {

    private static final long MEAL_ALLOWANCE = 2000000;
    private int totalWorkingday;
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
        return totalWorkingday;
    }

    public FulltimeEmployee(String name, int age, String identificationNunber, int totalWorkingday, long dailySalary) {
        super(name, age, identificationNunber);
        this.totalWorkingday = totalWorkingday;
        this.dailySalary = dailySalary;
    }

    @Override
    public String toString() {
        return String.format("name: %s,age: %d,Information Number: %s,Total Working day: %d,Daily Salary: %d",
                getName(),getAge(),getIdentificationNunber(),getWorkingCount(),getSalaryRate());
    }
}
