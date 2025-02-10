public class Octagon extends GeometericObject implements Comparable<Octagon>, Cloneable  {
double side1 = 1.0;
double side2 = 1.0;
double side3 = 1.0;
double side4 = 1.0;
double side5 = 1.0;
double side6 = 1.0;
double side7 = 1.0;
double side8 = 1.0;
Octagon(){

}
Octagon(double newSide1, double newSide2, double newSide3, double newSide4, double newSide5, double newSide6, double newSide7, double newSide8){
    side1 = newSide1;
    side2 = newSide2;
    side3 = newSide3;
    side4 = newSide4;
    side5 = newSide5;
    side6 = newSide6;
    side7 = newSide7;
    side8 = newSide8;
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
double getSide4(){
    return side4;
}
double getSide5(){
    return side5;
}
double getSide6(){
    return side6;
}
double getSide7(){
    return side7;
}
double getSide8(){
    return side8;
}
public double getArea(){
    double Area = (2 + 4 / Math.sqrt(2) * side1 * side3);
    return Area;
}
public double getPerimeter(){
    double Preimeter = (side1 + side2 + side3 + side4 + side5 + side6 + side7 + side8);
    return Preimeter;
}
@Override
public String toString(){
    return "Octagon: Side1 = " + side1 + " side 2 = " + side2 + " side 3 + " + side3 + " side 4 = " + side4 + "side 5 = " + side5 + " side 6 = " + side6 + " side 7 = " + side7 + " side 8 = " + side8;
}
@Override 
public int compareTo(Octagon shape){
    if (getArea() > shape.getArea())
    return 1;
    else if (getArea() < shape.getArea())
    return -1;
else 
    return 0;
}
@Override
public Object clone(){
    try {
        return super.clone();
    }
   catch (CloneNotSupportedException ex){
    return null;
   }

}
}
