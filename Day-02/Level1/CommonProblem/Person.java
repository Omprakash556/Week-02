public class Person {
    // Attributes
    private String name;
    private int age;

    // Default constructor
    Person(String  name, int age){
        this.name = name;
        this.age = age;
        System.out.println("This is parameterized constructors. ");
    }
    // Parametrised constructor
    Person(Person useAbove){
        this.name = useAbove.name;
        this.age = useAbove.age;
    }
    // Method to display results

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {

        Person person = new Person("Om Prakash", 22);
        person.displayDetails();

        Person person1 = new Person(person);
        person1.displayDetails();


    }
}
