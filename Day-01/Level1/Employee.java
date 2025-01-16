import java.util.Scanner;

public  class Employee {
     String name;
     String id;
     double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayResults() {
        System.out.println("The name of employee is: " + name);
        System.out.println("The id of employee is: " + id);
        System.out.println("The salary of employee is: " + salary);
    }


    public static class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter name of Employee: ");
            String name = input.nextLine();

            System.out.println("Enter id of Employee: ");
            String id = input.nextLine();

            System.out.println("Enter salary of Employee: ");
            double salary = input.nextDouble();


            Employee employee = new Employee(name, id, salary);
            employee.displayResults();
        }
    }
}

