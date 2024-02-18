/*
 * created by Max$
 */


package lesson024.homeWork024;

public class BankAccount implements PaymentSystem {
    private double kundenBalance;

    public BankAccount(double kundenBalance) {
        this.kundenBalance = kundenBalance;
    }

    @Override
    public double transferMoney(double sum) {
        if (kundenBalance > sum) {
            System.out.println("Ваши деньги переведены в сумме : " + sum);
            kundenBalance = kundenBalance - sum;
        } else {
            System.out.println("Денег на счете не хватает");
        }
        return kundenBalance;
    }

    @Override
    public double withdrawMoney(double sum) {
        if (kundenBalance > sum) {
            System.out.println("Ваши деньги сняты в сумме : " + sum);
            kundenBalance = kundenBalance - sum;
        } else {
            System.out.println("Денег на счете не хватает");
        }
        return kundenBalance;
    }

    @Override
    public double checkBalance() {

        System.out.println("На вашем балансе " + kundenBalance + " денег!");
        return kundenBalance;
    }
}
