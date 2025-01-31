import java.util.Scanner;

public class Exercise12_15 {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("Exercise12_15.txt");
        if (file.exists()){
            System.out.println("file already exists");
            
        }
        int[] jan = new int[100];
        java.io.PrintWriter output = new java.io.PrintWriter(file);
       for(int i = 0; i < 100; i++){
        output.print((int)(Math.random() * 100) + " ");
       }
       output.close();

       Scanner input = new Scanner(file);
       int score = 0;
       while (input.hasNext()) {
        int firstnumber = input.nextInt();
        jan[score] = firstnumber;
        score++;
        
       }
       java.util.Arrays.sort(jan);
       for (int i = 0; i < jan.length; i++)
         System.out.print(jan[i] + " ");
    }
    
}
