class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing $" + amount);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining: $" + balance);
        } else {
            System.out.println(name + " tried to withdraw $" + amount + " but insufficient funds.");
        }
    }
}

class WithdrawThread extends Thread {
    BankAccount account;
    String name;
    int amount;

    WithdrawThread(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        new WithdrawThread(account, "Alice", 700).start();
        new WithdrawThread(account, "Bob", 500).start();
    }
}
