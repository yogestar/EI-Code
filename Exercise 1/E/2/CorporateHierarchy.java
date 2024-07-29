package main.java.com.corporatehierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CorporateHierarchy {
    private static final Logger logger = Logger.getLogger(CorporateHierarchy.class.getName());

    // Global lists to maintain employees and managers
    private static final List<IndividualEmployee> employees = new ArrayList<>();
    private static final List<Manager> managers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nCorporate Hierarchy Management:");
                System.out.println("1. Add Individual Employee");
                System.out.println("2. Add Manager");
                System.out.println("3. Add Employee to Manager");
                System.out.println("4. Show Details");
                System.out.println("5. Show Total Salary");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee Name: ");
                        String empName = scanner.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double empSalary = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        IndividualEmployee employee = new IndividualEmployee(empName, empSalary);
                        employees.add(employee);
                        System.out.println("Employee added: " + empName);
                        break;

                    case 2:
                        System.out.print("Enter Manager Name: ");
                        String managerName = scanner.nextLine();
                        Manager manager = new Manager(managerName);
                        managers.add(manager);
                        System.out.println("Manager added: " + managerName);
                        break;

                    case 3:
                        System.out.print("Enter Manager Name to Add Employee To: ");
                        String managerNameToAdd = scanner.nextLine();
                        Manager managerToAdd = findManagerByName(managerNameToAdd);
                        if (managerToAdd != null) {
                            System.out.print("Enter Employee Name to Add: ");
                            String employeeNameToAdd = scanner.nextLine();
                            IndividualEmployee employeeToAdd = findEmployeeByName(employeeNameToAdd);
                            if (employeeToAdd != null) {
                                managerToAdd.add(employeeToAdd);
                                System.out.println("Employee added to Manager: " + managerNameToAdd);
                            } else {
                                System.out.println("Employee not found.");
                            }
                        } else {
                            System.out.println("Manager not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Manager Name to Show Details: ");
                        String managerNameToShow = scanner.nextLine();
                        Manager managerToShow = findManagerByName(managerNameToShow);
                        if (managerToShow != null) {
                            managerToShow.showDetails();
                        } else {
                            System.out.println("Manager not found.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter Manager Name to Show Total Salary: ");
                        String managerNameForSalary = scanner.nextLine();
                        Manager managerForSalary = findManagerByName(managerNameForSalary);
                        if (managerForSalary != null) {
                            System.out.println("Total Salary under " + managerNameForSalary + ": $" + managerForSalary.getSalary());
                        } else {
                            System.out.println("Manager not found.");
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred: " + e.getMessage(), e);
        }
    }

    private static Manager findManagerByName(String name) {
        for (Manager manager : managers) {
            if (manager.getName().equals(name)) {
                return manager;
            }
        }
        return null;
    }

    private static IndividualEmployee findEmployeeByName(String name) {
        for (IndividualEmployee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }
}
