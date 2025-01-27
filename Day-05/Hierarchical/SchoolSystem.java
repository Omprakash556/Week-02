
class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayRole(){
        System.out.println("Person Name: "+name);
        System.out.println("Person Age: "+age);
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayRole() {
        super.displayRole();
        System.out.println("Subject: "+ subject);
    }
}

class Student extends Person {
    char grade;
    Student(String name, int age, char grade){
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayRole() {
        super.displayRole();
        System.out.println("Grade: "+grade);
    }
}

class Staff extends Person{
    String position;
    Staff(String name, int age, String position){
        super(name, age);
        this.position = position;
    }

    @Override
    void displayRole() {
        super.displayRole();
        System.out.println("Position: "+position);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {

        Person person = new Person("Om Prakash", 22);
        person.displayRole();
        System.out.println();

        Teacher teacher = new Teacher("Manohar ji", 30, "Software Engineering");
        teacher.displayRole();
        System.out.println();

        Student student = new Student("Deepansh", 24, 'A');
        student.displayRole();
        System.out.println();

        Staff staff = new Staff("ABZ", 40, "Labour");
        staff.displayRole();

    }
}
