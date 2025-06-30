package klassnayadzz.klassnayadzz.POLYPHORMISM;
public class BankSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount(),
                new CheckingAccount(),
                new BusinessAccount()
        };


        for (BankAccount account : accounts) {
            account.accountType();
            account.deposit(1000);
            account.withdraw(500);
            System.out.println();
        }
    }
}

class BankAccount {
    double balance;

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнено: " + amount + " | Баланс: " + balance);
    }

    public void accountType() {
        System.out.println("Обычный банковский счет");
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Снятие со сберегательного счета");
        super.withdraw(amount);
        System.out.println("Баланс после снятия: " + balance);
    }

    @Override
    public void accountType() {
        System.out.println("Сберегательный счет");
    }
}

class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Снятие с расчетного счета");
        super.withdraw(amount);
        System.out.println("Баланс после снятия: " + balance);
    }

    @Override
    public void accountType() {
        System.out.println("Расчетный счет");
    }
}
class BusinessAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Снятие с бизнес-счета");
        super.withdraw(amount);
        System.out.println("Баланс после снятия: " + balance);
    }

    @Override
    public void accountType() {
        System.out.println("Бизнес счет");
    }
}
