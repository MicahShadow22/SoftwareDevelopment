import java.io.*;

public class File2 {
public static void main(String[] args) throws IOException {
    int add = 1;
    try(DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise 17_03.dat"));){
        for (int i = 1; i <= 100; i++){
            
            //System.out.println((int)(Math.random() * 100));
            output.writeInt((int)(Math.random() * 100));
        }
    }
    try(DataInputStream input = new DataInputStream(new FileInputStream("Exercise 17_03.dat"));){
        while (true) {
            // make a variable
            // add each number together as its read
            add += input.readInt();
        }

    }
    catch(EOFException ex){
        System.out.println(add);
    }
    catch(IOException ex){
        ex.printStackTrace();
    }

    
    
}
    
}