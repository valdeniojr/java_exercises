package activities3.question08;

public class AccountBank {
    private double balance;

    public AccountBank(double balanceInit) {
        this.balance = balanceInit;
    }

    public void withdraw(double valor) throws InsufficientFundsException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }

        if (valor > balance) {
            throw new InsufficientFundsException("Saldo insuficiente para realizar o saque.");
        }

        balance -= valor;
    }

    public double getBalance() {
        return balance;
    }
}
