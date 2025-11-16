package domain;

public sealed abstract class Employee permits Manager, Salesman {

    protected String code;

    protected String name;

    protected double salary;

    public Employee(String code,
                    String name,
                    double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}

    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getfullSalary();
    public double getfullSalary(double extra){
        return this.getfullSalary() + extra;
    }

    @Override
    public String toString() {
        return String.format("Code: %s | Name: %s | Salary: %.2f", code, name, salary);
    }
}
