import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class File {
    public static void main(String[] args) throws IOException{
    try{
        java.io.File file = new java.io.File("Exercise17_01.txt");
        PrintWriter printer = new PrintWriter(file);
        for(int i = 1; i <= 100; i++){
            printer.print((int)(Math.random() * 100) + " ");
           
            


        }
        printer.close();
    }
    catch(FileNotFoundException file1) {
        System.out.println("File does not exist");
    }
    catch(IOException io){
        System.out.println("Output does not exist");

    }
  


}
}