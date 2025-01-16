package Level2;
public class Students {
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize the attributes
    public Students(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        String grade = calculateGrade();
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Creating student objects and displaying their details
        Students student1 = new Students("John Doe", 101, 85);
        student1.displayDetails();

        Students student2 = new Students("Jane Smith", 102, 92);
        student2.displayDetails();
    }
}

