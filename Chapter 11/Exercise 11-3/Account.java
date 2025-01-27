import java.util.Date;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualinterestRate = 0;
    Date dateCreated = new Date();


    Account(){
    }
    
    Account(int newId, double newBalance){
        id = newId;
        balance = newBalance;
      

    }
    
    public double getid(){
        return id;
    }

    public void setid(int ID){
        id = (ID);
    }

    public double getbalance(){
        return balance;
    }

    public void setbalance(double Balance){
        balance = (Balance);
    }

    public double getannualinterestRate(){
        return  annualinterestRate;
    }

    public void setannualinterestRate(double AnnualInterestRate){
        annualinterestRate = (AnnualInterestRate);
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    Double getMonthlyinterestRate(){
        return annualinterestRate / 12;
    }

    double getMonthlyinterest(){
        double monthlyinterestRate = annualinterestRate / 12;
        double Rate = balance * monthlyinterestRate;
        return Rate;

    }

    double withdraw(double Take){
        return balance - Take;
    }
    
    double deposit(double Add){
        return balance + Add;
    }
@Override
public String toString() {
    return "Your account id is: " + id + "Your account Balance is: " + balance + "The Date created is: " + dateCreated;
}


}  
