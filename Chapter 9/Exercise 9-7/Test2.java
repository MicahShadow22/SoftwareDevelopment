public class Test2 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000, 4.5 );
        account1.setbalance(account1.withdraw(2500)); 
        account1.setbalance(account1.deposit(3000));
        System.out.println("The balance " + "is " + account1.getbalance());
        System.out.println("The Monthly Interest " + "is " + account1.getMonthlyinterest());
        System.out.println("This Account was created " + "in " + account1.dateCreated);
    }
    
}