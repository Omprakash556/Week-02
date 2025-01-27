
class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

interface Worker {
    void performDuties();
}
class Chef extends Person implements Worker {
    String specialty;


    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }


    @Override
    public void performDuties() {
        System.out.println(name + " is cooking specialty: " + specialty);
    }
}


class Waiter extends Person implements Worker {
    String section;


    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }


    @Override
    public void performDuties() {
        System.out.println(name + " is serving in section: " + section);
    }
}


public class RestaurantSystem {
    public static void main(String[] args) {

        Chef chef = new Chef("Sonu", 101, "Meat making");
        Waiter waiter = new Waiter("Govind", 102, "A1");


        System.out.println(chef);
        chef.performDuties();

        System.out.println(waiter);
        waiter.performDuties();
    }
}
