class BankAccount {
    private double balance;
    public void deposit(double amount){
        if(amount > 0){
            balance = balance += amount;
        } else {
            System.out.println("Invalid Amount");
        }

    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance -= amount;
        } else {
            System.out.println("Insufficient funds or Invalid amount");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class abst{
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.deposit(1250);
        b.withdraw(485);
        System.out.println(b.getBalance());
    }
}
