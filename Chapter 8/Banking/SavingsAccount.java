public class SavingsAccount extends Account {   
    private double apr;

    public SavingsAccount(int idNumber, double annualInterest, double startBal){
        super(idNumber,startBal);
        apr=annualInterest;
    }
    public void withdraw(double withdrawal){
        if(withdrawal<currentBalance()){
            decreaseBalance(withdrawal);
        }
    }
    public double monthlyInterest(){
        return (currentBalance()*apr)/12;
    }
}
