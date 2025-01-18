// Parent class: Student
 class Student {
    // Instance variables
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor to initialize the student's details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set the CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It must be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

    // Constructor to initialize postgraduate student's details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); // Calling the parent class constructor
    }

    // Method to display postgraduate student's details (demonstrates use of 'protected' member)
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Accessing public member
        System.out.println("Name: " + name); // Accessing protected member from subclass
        System.out.println("CGPA: " + getCGPA()); // Using public method to get private CGPA
    }
}

// Main class to test the functionality
public class UniversityManagementSystem {

    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student(101, "Alice", 8.5);
        student1.displayStudentDetails();
        System.out.println();

        // Modifying CGPA using the public method
        student1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        System.out.println();

        // Creating a postgraduate student object
        PostgraduateStudent pgStudent1 = new PostgraduateStudent(201, "Bob", 9.8);
        pgStudent1.displayPostgraduateDetails();
    }
}
