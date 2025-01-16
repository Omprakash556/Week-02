import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(double radius){
        return 2*Math.PI*radius*radius;
    }

    public double calculateCircumference(double radius){
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of a Circle: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Area of Circle is= "+circle.calculateArea(radius));
        System.out.println("Circumferences of Circle is= "+circle.calculateCircumference(radius));



    }
}
