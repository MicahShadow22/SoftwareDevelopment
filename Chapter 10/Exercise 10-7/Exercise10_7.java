import java.util.Scanner;

public class Exercise10_7 {
    public static void main(String[] args) {
        Account account0 = new Account(0,100);
        Account account1 = new Account(1,100);
        Account account2 = new Account(2,100);
        Account account3 = new Account(3,100);
        Account account4 = new Account(4,100);
        Account account5 = new Account(5,100);
        Account account6 = new Account(6,100);
        Account account7 = new Account(7,100);
        Account account8 = new Account(8,100);
        Account account9 = new Account(9,100);
        Account[] wish = {account0,account1,account2,account3,account4,account5,account6,account7,account8,account9};
        while (true){
            
        System.out.println("Enter an ID: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt(); 
        int choose = 0;
        if (id < 10 && id >= 0){
            while (choose != 4) {
                
            
            System.out.println("Your in!");
            System.out.println("\nMain menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("Which do you choose user? : ");
            choose = input.nextInt();
            if (choose < 4 && choose >= 0){
                if (choose == 1){
                    System.out.println(wish[id].getbalance());

                }
                if (choose == 2){
                    System.out.println("How much do you wish to withdraw? : ");
                    double amount = input.nextDouble();
                    double draw = wish[id].withdraw(amount);
                    wish[id].setbalance(draw);
                    System.out.println("Your withdraw " + "is: " + amount);
                    System.out.println("The remaining money is: " + wish[id].getbalance());



                }
                if (choose == 3){
                    System.out.println("How much do you wish to deposit? : ");
                    double addmore = input.nextDouble();
                    double plusmore = wish[id].deposit(addmore);
                    wish[id].setbalance(plusmore);
                    System.out.println("Your deposit " + "is: " + addmore);
                    System.out.println("The added money is: " + wish[id].getbalance());

                }
                if (choose == 4){


                }
            }


        }
        } else {
            System.out.println("Try again, Enter another ID");
        }
    }

        




        
    
        
    }
    
}