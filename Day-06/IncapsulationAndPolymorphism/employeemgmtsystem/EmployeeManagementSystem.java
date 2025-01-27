package IncapsulationAndPolymorphism.employeemgmtsystem;

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary: " + calculateSalary());
    }

    // Getters and setters for encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

// Department interface
interface Department {
    void assignDepartment(String departmentName);
    void getDepartmentDetails();
}

// FullTimeEmployee class extending Employee and implementing Department
class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;  // Full-time employees get a fixed salary
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}

// PartTimeEmployee class extending Employee and implementing Department
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;  // Part-time employees are paid based on hours worked
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

// Main class to test the system
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects
        FullTimeEmployee ftEmployee = new FullTimeEmployee(101, "Om Prakash", 50000, 60000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee(102, "Deepansh Khare", 20000, 200, 25);

        // Assigning departments
        ftEmployee.assignDepartment("IT");
        ptEmployee.assignDepartment("Marketing");

        // Displaying details
        Employee[] employees = {ftEmployee, ptEmployee};
        for (Employee employee : employees) {
            employee.displayDetails();

            if (employee instanceof Department) {
                ((Department) employee).getDepartmentDetails();
            }
            System.out.println();
        }
    }
}
