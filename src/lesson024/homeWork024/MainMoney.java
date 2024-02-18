/*
 * created by max$
 */


package lesson024.homeWork024;

public class MainMoney {
    public static void main(String[] args) {
        ElectronicWallet electronicWallet = new ElectronicWallet(234553, 24.50);
        electronicWallet.checkBalance();
        electronicWallet.transferMoney(25);
        electronicWallet.withdrawMoney(15);
        System.out.println("===========================");

        BankAccount bankAccount = new BankAccount(57);
        bankAccount.checkBalance();
        bankAccount.transferMoney(56);
        bankAccount.checkBalance();
        bankAccount.withdrawMoney(3);


    }
}
