package class1.ex;

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private int balance;

    public BankAccount(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.printf("%d원 입금완료. 현재 잔액 : %d%n", amount, balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("%d원 출금완료. 현재 잔액 : %d%n", amount, balance);
        } else {
            System.out.println("잔액부족");
        }
    }

    public int getBalance() {
        return balance;
    }
    
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123-456", "David", 10000);
        account1.deposit(5000);
        account1.withdraw(2000);
        account1.withdraw(20000);
    }
}
