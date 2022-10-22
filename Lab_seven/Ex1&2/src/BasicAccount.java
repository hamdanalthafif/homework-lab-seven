public class BasicAccount extends BankAccount {
    private double balance;

    public BasicAccount() {
       this.balance=balance;
    }

    public BasicAccount(double initialBalance) {

    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance - amount >= 0) {
            balance-=amount;
           // super.getBalance() -= amount;
        } else if (amount < 0) {
            throw new IllegalArgumentException("Withdraw amount should be positive and greater than 0.");
        } else {
            System.out.println("Error: Withdraw amount exceeds available funds.");
        }
    }
}
