public class Test3 {
    public static void main(String[] args){
        MyInteger myInteger1 = new MyInteger(7);
        MyInteger myInteger2 = new MyInteger(7);
        char[] myInteger3 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The value of Even " + "is " + myInteger1.isEven());
        System.out.println("The value of Odd " + "is " + myInteger1.isOdd());
        System.out.println("The value of Prime " + "is " + myInteger1.isPrime());
        System.out.println("The value of int Even " + "is " + myInteger1.isEven(7));
        System.out.println("The value of int Odd " + "is " + myInteger1.isOdd(7));
        System.out.println("The value of int Prime " + "is " + myInteger1.isPrime(7));
        System.out.println("The value of in Even " + "is " + myInteger1.isEven(myInteger1));
        System.out.println("The value of out Odd " + "is " + myInteger1.isOdd(myInteger1));
        System.out.println("The value of or Prime " + "is " + myInteger1.isPrime(myInteger1));
        System.out.println("The value of Equal " + "is " + myInteger1.equals(7));
        System.out.println("The value of Equal 2 " + "is " + myInteger1.equals(myInteger2));
        System.out.println("The value of Char " + "is " + myInteger1.parseint(myInteger3));
        System.out.println("The value of String " + "is " + myInteger1.parseint("12345678910"));
    }
}