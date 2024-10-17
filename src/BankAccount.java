public class BankAccount {
    private static int accountCount = 0;
    
    private double balance;
    private String owner;
    
    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0.0;
        accountCount++; 
    }
    
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        accountCount++;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void credit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    
    public boolean debit(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    public static int getAccountCount() {
        return accountCount;
    }
    
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice");
        
        BankAccount account2 = new BankAccount("Bob", 1000.0);
        
        System.out.println("Owner of account1: " + account1.getOwner());
        System.out.println("Balance of account1: " + account1.getBalance());
        
        account1.credit(500);
        account1.debit(200);
        
        System.out.println("Balance of account1 after transactions: " + account1.getBalance());
        
        System.out.println("Total accounts created: " + BankAccount.getAccountCount());
    }
}