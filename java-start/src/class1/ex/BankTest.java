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

    
}

public class BankTest {
    public static void main(String[] args) {

    }
}
