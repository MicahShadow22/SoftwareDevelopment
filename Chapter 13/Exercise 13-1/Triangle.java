public class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;
    Triangle(){

    }
    Triangle(double newSide1, double newSide2, double newSide3){
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
    }
    double getSide1(){
        return side1;
    }
    double getSide2(){
        return side2;
    }
    double getSide3(){
        return side3;
    }
    public double getArea(){
        double s = (side1 + side2 + side3 / 2);
        double Area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return Area; 
    }
    public double getPerimeter(){
        double Perimeter = (side1 + side2 + side3);
        return Perimeter;
    }
    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
    
}
