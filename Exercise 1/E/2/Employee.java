package main.java.com.corporatehierarchy;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void showDetails();
    public abstract double getSalary();
}
