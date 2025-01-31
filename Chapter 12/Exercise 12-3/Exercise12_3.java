import java.util.Scanner;

public class Exercise12_3 {
    public static void main(String[] args) throws Exception {
        try{
        
       int[] jan = new int[100];
       for(int i = 0; i < 100; i++){
        jan[i] = (int)(Math.random() * 100);
       }
       
       System.out.println("Enter a number: ");
       Scanner input = new Scanner(System.in);
       int feb = input.nextInt();
       System.out.println("Here's a number: " + jan[feb]);
    }
    catch (ArrayIndexOutOfBoundsException ex){
        System.out.println("Out of Bounds, it only goes to 100");

    }
    }
}
