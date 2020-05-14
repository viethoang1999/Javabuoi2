package OPPbuoi2;

public class PartTimeEmployee extends Employee {
    private static final long MEAL_ALLOWANCE = 0;
    private int totalWorkingShift;
    private long baseSalary;

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }

    public PartTimeEmployee(String name, int age, String identificationNunber, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNunber);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }
    @Override
    public String toString() {
        return String.format("name: %s,age: %d,Information Number: %s,Total Working shift: %d,base Salary: %d",
                getName(),getAge(),getIdentificationNunber(),getWorkingCount(),getSalaryRate());
    }
}
