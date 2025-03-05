/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

public class Exercise17_07  {
    public static void main(String[] args) {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);        
        try {
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
            output.writeObject(loan1);
            output.writeObject(loan2);
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
        outputData(loan1, loan2);
            }
        
        public static void outputData(Loan loan1, Loan loan2){
        int more = 0;
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));
            // loop to read each object
            while (true){
                Loan loanRead1 = (Loan)input.readObject();
                more += loanRead1.getLoanAmount();
                Loan loanRead2 = (Loan)input.readObject();
                more += loanRead2.getLoanAmount();
                
            }
            
            // add together each amount in each object
            
        }
        catch(EOFException ex){
            System.out.println("Here's the loan amount: " + more);
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
    }
}