import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private Professor professor; // Aggregation: A course can have a professor assigned to it
    private List<Student> enrolledStudents; // Association: A course knows its enrolled students

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " has been assigned to teach " + courseName);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " has enrolled in " + courseName);
    }

    public void listEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }

    public Professor getProfessor() {
        return professor;
    }
}

// Student class
class Student {
    private String name;
    private List<Course> enrolledCourses; // Association: A student can enroll in multiple courses

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this); // Notify the course of the enrollment
    }

    public void listEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// Professor class
class Professor {
    private String name;
    private List<Course> teachingCourses; // Aggregation: A professor can teach multiple courses

    public Professor(String name) {
        this.name = name;
        this.teachingCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void teachCourse(Course course) {
        teachingCourses.add(course);
        course.assignProfessor(this); // Notify the course of the assignment
    }

    public void listTeachingCourses() {
        System.out.println("Professor " + name + " is teaching the following courses:");
        for (Course course : teachingCourses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// Main class to demonstrate
public class UniversityManagement {
    public static void main(String[] args) {

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Assign professors to courses
        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        // Display professor assignments
        professor1.listTeachingCourses();
        professor2.listTeachingCourses();

        // Display student enrollments
        student1.listEnrolledCourses();
        student2.listEnrolledCourses();

        // List students in courses
        course1.listEnrolledStudents();
        course2.listEnrolledStudents();
    }
}
