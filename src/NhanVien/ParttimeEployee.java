package NhanVien;

public  class ParttimeEployee extends Employee{
    public static final long MEAL_ALLƠANCE=0;

    private int totalWorkingShif;
    private long baseSalary;
    @Override
    public long getMealAllowance() {
        return MEAL_ALLƠANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShif;
    }

    public ParttimeEployee(String name, int age, String identificationNumber, int totalWorkingShif, long baseSalary) {
        super(name, age, identificationNumber);
        this.totalWorkingShif = totalWorkingShif;
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return String.format("name: %s,age: %s,identificationNumber: %s,totalWorKingShif: %s,baseSalary: %s",
                getName(),getAge(),getIdentificationNumber(),getWorkingCount(),getSalaryRate());
    }
}
