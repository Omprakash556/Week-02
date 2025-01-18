// Parent class: Employee
 public class Employee {
    // Instance variables
    public String employeeID; 
    protected String department;
    private double salary;

    // Constructor to initialize the employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify the salary
    public void modifySalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {

    // Constructor to initialize manager details
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary); // Calling the parent class constructor
    }

    // Method to display manager details (demonstrates access of public and protected members)
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member from subclass
        System.out.println("Salary: $" + getSalary()); // Using public method to get private salary
    }
}

// Main class to test the Employee and Manager classes
  class EmployeeRecords {

    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee("E12345", "Marketing", 55000.00);
        employee1.displayEmployeeDetails();
        System.out.println();

        // Modifying the salary using the public method
        employee1.modifySalary(60000.00);
        System.out.println("Updated Salary: $" + employee1.getSalary());
        System.out.println();

        // Creating a Manager object
        Manager manager1 = new Manager("M67890", "Sales", 80000.00);
        manager1.displayManagerDetails();
    }
}
