import java.io.*;
import java.util.Scanner;

public class Encypt {
    public static void main(String[] args) throws IOException {
        int somename = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name for the input file: ");
        String add = input.nextLine();
    
        System.out.println("Enter a name for the output file: ");
        String less = input.nextLine();

        try(DataOutputStream output = new DataOutputStream(new FileOutputStream(add));){
            output.writeInt(5 + 5);
            
        }
        try(DataInputStream in = new DataInputStream(new FileInputStream(less));){
            // loop to read whole file
            while (true) {
                somename += in.readInt();
                
            }
            
        }
        catch(EOFException ex){
            somename = somename - 5; // subtract 5 from the number in the file
            System.out.println(somename);// printout of their number
        }
    }
}
