public class Main {
    public static void main(String args[]) {
        BankAccount account = new BankAccount(100.00);
        double balance = account.getBalance(); //expected 100.00;

        account.withdraw(80.00);
        balance = account.getBalance(); //expected 20.00;

        account.withdraw(50.00);
        balance = account.getBalance(); //expected 20.00 because the amount to withdraw is larger than the balance
        System.out.println(balance);
    }
}
