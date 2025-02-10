public class Test6 extends Triangle {
    public static void main(String[] args) {
    GeometricObject[] red = new GeometricObject[5];
    red[0] = new Triangle(4, 7, 9);
    red[1] = new Triangle(1, 8, 3);
    red[2] = new Triangle(2, 6, 4);
    red[3] = new Triangle(5, 9, 7);
    red[4] = new Triangle(9, 5, 3);
    if (red[0] instanceof Colorable){
    System.out.println(red[0].getArea());
    System.out.println(red[1].getArea());
    System.out.println(red[2].getArea());
    System.out.println(red[3].getArea());
    System.out.println(red[4].getArea());

    ((Colorable)red[0]).howToColor();
    ((Colorable)red[1]).howToColor();
    ((Colorable)red[2]).howToColor();
    ((Colorable)red[3]).howToColor();
    ((Colorable)red[4]).howToColor();

    }

    }
}