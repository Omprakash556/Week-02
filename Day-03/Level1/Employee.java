public class Employee {
    // Attributes
    private static String companyName = "Bridge Lab";
    private static int totalEmployee = 0;

    // Method of display total employee
    public static int displayTotalEmployees(int totalEmployee){
        return totalEmployee;
    }

    // Attributes
    private String name;
    private final int id;
    private String destination;

    // Parametrised Constructor
    Employee(String name, int id, String destination){
        this.name = name;
        this.id = id;
        this.destination = destination;
        totalEmployee++;
    }

    // Display results
    public  void displayResults(){
        if(this instanceof Employee){
            System.out.println("Employee Name: "+name);
            System.out.println("Employee id: "+id);
            System.out.println("Destination: "+destination);
        }
    }


// Main method

    public static void main(String[] args) {
        System.out.println("Company Name is: "+Employee.companyName);

        Employee employee = new Employee("Om Prakash", 1, "Bangalore");
        employee.displayResults();
        System.out.println();

        Employee employee1 = new Employee("Furquan", 2, "Jammu");
        employee1.displayResults();
        System.out.println();

        System.out.println("Total Employee "+displayTotalEmployees(totalEmployee));
    }
}
