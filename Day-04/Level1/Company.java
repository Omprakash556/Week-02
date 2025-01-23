

// Composition Example

import java.util.ArrayList;
import java.util.List;

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a new department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
        System.out.println("Department " + departmentName + " added to the company " + name);
    }

    // Display all departments and employees
    public void displayCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Delete the company and all associated departments and employees
    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear(); // All departments and employees are also deleted
    }

    // Inner Department class to enforce composition
    private class Department {
        private String name;
        private List<Employee> employees;

        public Department(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        // Add an employee to the department
        public void addEmployee(String employeeName) {
            employees.add(new Employee(employeeName));
            System.out.println("Employee " + employeeName + " added to department " + name);
        }

        // Display department details
        public void displayDepartmentDetails() {
            System.out.println("  Department: " + name);
            for (Employee employee : employees) {
                employee.displayEmployeeDetails();
            }
        }

        // Inner Employee class to enforce composition
        private class Employee {
            private String name;

            public Employee(String name) {
                this.name = name;
            }

            public void displayEmployeeDetails() {
                System.out.println("    Employee: " + name);
            }
        }
    }

    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Tech Solutions");

        // Add departments to the company
        company.addDepartment("HR");
        company.addDepartment("IT");
        company.addDepartment("Finance");

        // Add employees to each department
        Department hrDepartment = company.new Department("HR");
        hrDepartment.addEmployee("Prakash");
        hrDepartment.addEmployee("Deepansh");

        Department itDepartment = company.new Department("IT");
        itDepartment.addEmployee("Prahlad");
        itDepartment.addEmployee("Suman");

        Department financeDepartment = company.new Department("Finance");
        financeDepartment.addEmployee("Kumar");

        // Display the company structure
        company.displayCompanyStructure();

        // Delete the company
        company.deleteCompany();

        // Attempt to display the company structure after deletion
        company.displayCompanyStructure(); // Should show no departments or employees
    }
}
