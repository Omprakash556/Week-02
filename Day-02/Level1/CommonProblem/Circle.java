
public class Circle {
    // Attributes
   private int radius;

    // Default constructor
    Circle(){
        this(89);
        System.out.println("This is default value of radius. "+radius);
    }
    // Parametrised constructor
    Circle(int radius){
        this.radius = radius;
        System.out.println("This is user-provided value of radius. "+radius);
    }


    public static void main(String[] args) {

        Circle circle = new Circle();

        Circle circle1 = new Circle(34);


    }
}
