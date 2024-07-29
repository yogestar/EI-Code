package main.java.com.corporatehierarchy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class IndividualEmployee extends Employee {
    private static final Logger logger = Logger.getLogger(IndividualEmployee.class.getName());
    private double salary;

    public IndividualEmployee(String name, double salary) {
        super(name);
        if (salary < 0) {
            logger.severe("Salary cannot be negative.");
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
        logger.info("IndividualEmployee created: " + name + " with salary: " + salary);
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
