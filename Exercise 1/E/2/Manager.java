package main.java.com.corporatehierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager extends Employee {
    private static final Logger logger = Logger.getLogger(Manager.class.getName());
    private List<Employee> employees = new ArrayList<>();

    public Manager(String name) {
        super(name);
        logger.info("Manager created: " + name);
    }

    public void add(Employee employee) {
        if (employee == null) {
            logger.severe("Cannot add null employee.");
            throw new IllegalArgumentException("Cannot add null employee.");
        }
        employees.add(employee);
        logger.info("Employee added to Manager: " + employee.getName());
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee employee : employees) {
            employee.showDetails();
        }
    }

    @Override
    public double getSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).sum();
    }
}
