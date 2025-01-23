

// Class representing a School
import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

// Class representing a Student
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}

// Class representing a Course
class Course {
    private String title;
    private List<Student> students;

    public Course(String title) {
        this.title = title;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getTitle() {
        return title;
    }
}

// Main class to demonstrate functionality
public class SchoolAndStudentsWithCourses {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Technocrats International School: ");

        // Create students
        Student student1 = new Student("Om Prakash");
        Student student2 = new Student("Anand");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Students enroll in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display courses for each student
        for (Student student : school.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Course Enrolled: ");
            for (Course course : student.getCourses()) {
                System.out.println(course.getTitle());
            }
        }

        // Display students for each course
        System.out.println("\nCourses and their enrolled students:");
        for (Course course : List.of(course1, course2)) {
            System.out.println("Course: " + course.getTitle());
            System.out.println("Enrolled Students:");
            for (Student student : course.getStudents()) {
                System.out.println(student.getName());
            }
        }
    }
}

