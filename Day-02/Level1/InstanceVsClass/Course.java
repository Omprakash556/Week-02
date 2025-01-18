public class Course {
    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "Tech Academy";

    // Constructor to initialize the course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to display the institute name (shared by all courses)
    public static void displayInstituteName() {
        System.out.println("Institute Name: " + instituteName);
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 12, 500.0);
        Course course2 = new Course("Data Science", 16, 750.0);
        Course course3 = new Course("Web Development", 10, 400.0);

        // Displaying institute name (common for all courses)
        Course.displayInstituteName();

        // Displaying details for each course
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
