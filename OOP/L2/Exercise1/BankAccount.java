public class BankAccount {
    private String bank;
    private double balance;

    public BankAccount(String bank, double balance) {
        this.bank = bank;
        this.balance = balance;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBank() {
        return this.bank;
    }

    public double getBalance() {
        return this.balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void debit(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public String toString() {
        return "[Bank: " + this.bank + ", Balance: " + this.balance + "]";
    }
}
