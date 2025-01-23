import java.util.ArrayList;
import java.util.List;

// Faculty class
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments; // Composition relationship
    private List<Faculty> faculties;     // Aggregation relationship

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void deleteUniversity() {
        // Deleting the university deletes all its departments
        departments.clear();
        System.out.println("University and its departments deleted.");
    }

    public String getName() {
        return name;
    }
}

// Main class to demonstrate
public class Main {
    public static void main(String[] args) {
        // Create some faculty members
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");

        // Create some departments
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        // Create a university
        University university = new University("Tech University");

        // Add departments to the university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Add faculty members to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display the university's departments and faculty members
        System.out.println("University: " + university.getName());
        System.out.println("Departments:");
        for (Department dept : university.getDepartments()) {
            System.out.println(" - " + dept.getName());
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println(" - " + faculty.getName());
        }

        // Delete the university
        university.deleteUniversity();

        // Show that faculty members still exist
        System.out.println("\nFaculty Members (independent of university):");
        System.out.println(" - " + faculty1.getName());
        System.out.println(" - " + faculty2.getName());
    }
}
