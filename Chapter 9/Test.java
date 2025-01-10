public class Test {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println("The Width of the Rectangle of " + rectangle1.width  );
        System.out.println("The Height of the Rectangle of " + rectangle1.height );
        System.out.println("The Area of the Rectangle " + "is " + rectangle1.getArea());
        System.out.println("The Perimeter of the Rectangle " + "is " + rectangle1.getPerimeter());
        
        
        System.out.println("\n");


        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("The Width of the Rectangle of " + rectangle2.width );
        System.out.println("The Height of the Rectangle of " + rectangle2.height );
        System.out.println("The Area of the Rectangle " + "is " + rectangle2.getArea());
        System.out.println("The Perimeter of the Rectangle " + "is " + rectangle2.getPerimeter());
        


    }
    
}
