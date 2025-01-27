class Animal {
public String name;
public int age;

        void makeSound(){
        System.out.println("Animal make sound...");
        }
        }

class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog make sound....");
    }
}

class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat make sound....");
    }
}

class Bird extends Animal{
    @Override
    void makeSound() {
        System.out.println("Bird make sound...");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Lebra";
        dog.age = 13;
        System.out.println("Dog Name: "+dog.name);
        System.out.println("Dog Age: "+dog.age);
        dog.makeSound();
        System.out.println();


        Cat cat = new Cat();
        cat.name = "Billi";
        cat.age = 6;
        System.out.println("Cat Name: "+cat.name);
        System.out.println("Cat Age: "+cat.age);
        cat.makeSound();
        System.out.println();


        Bird bird = new Bird();
        bird.name = "Parrot";
        bird.age = 3;
        System.out.println("Bird Name: "+bird.name);
        System.out.println("Bird Age: "+bird.age);
        bird.makeSound();
    }
}
