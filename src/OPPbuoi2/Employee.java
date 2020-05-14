package OPPbuoi2;

public abstract class Employee {
    public String name;
    public int age;
    public String identificationNunber;

    public Employee() {
    }

    public Employee(String name, int age, String identificationNunber) {
        this.name = name;
        this.age = age;
        this.identificationNunber = identificationNunber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIdentificationNunber() {
        return identificationNunber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentificationNunber(String identificationNunber) {
        this.identificationNunber = identificationNunber;
    }

    public abstract long getMealAllowance();

    public abstract long getSalaryRate();

    public abstract int getWorkingCount();

    public long calculateSalary() {
        long salary = getMealAllowance() + getWorkingCount() * getSalaryRate();
        return salary;
    }
}
