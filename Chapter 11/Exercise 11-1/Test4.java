import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle: ");
        double sides = input.nextDouble();
        double sides1 = input.nextDouble();
        double sides2 = input.nextDouble();
        System.out.println("Enter a Color: ");
        String Colors = input.next();
        System.out.println("Enter True or false: ");
        boolean value = input.nextBoolean();
        Triangle triangle = new Triangle(sides,sides1,sides2);
        triangle.setColor(Colors);
        triangle.setFilled(value);
       System.out.println("Here is the Area: " + triangle.getArea());
       System.out.println("Here is the Perimeter: " + triangle.getPerimeter());
       System.out.println("Here is the Color: " + triangle.getColor());
       System.out.println("Date Created: " + triangle.getDateCreated());
       System.out.println("If true or false: " + triangle.isFilled());
    }
    
}
