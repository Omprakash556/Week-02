class Employee{
    public String employeeName;
    public int employeeID;
    public double employeeSalary;


    Employee(String employeeName, int employeeID, double employeeSalary){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeSalary = employeeSalary;
    }
    void displayDetails(){
        System.out.println("Employee Name: "+employeeName);
        System.out.println("EmployeeID: "+employeeID);
        System.out.println("Employee Salary: "+employeeSalary);
    }
}

class Manager extends Employee{
    int teamSize;
    Manager(String employeeName,int employeeID, double employeeSalary, int teamSize){
        super(employeeName, employeeID, employeeSalary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team size: "+teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String employeeName,int employeeID, double employeeSalary, String programmingLanguage) {
        super(employeeName, employeeID, employeeSalary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}

class Intern extends Employee {
    String companyName;
    Intern(String employeeName,int employeeID, double employeeSalary, String companyName){
        super(employeeName, employeeID, employeeSalary);
        this.companyName = companyName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Company Name: "+companyName);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee employee = new Employee("Om Prakash", 100,28116.89);
        employee.displayDetails();
        System.out.println();

        System.out.println("Manager Details: ");
        Manager manager = new Manager("ABZ",101 ,40000.90, 10 );
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer Details: ");
        Developer developer = new Developer("XYZ", 102, 23000.89, "Java");
        developer.displayDetails();
        System.out.println();

        System.out.println("Inter Details: ");
        Intern intern = new Intern("BCW", 103, 25000, "Microsoft");
        intern.displayDetails();
        System.out.println();

    }
}
