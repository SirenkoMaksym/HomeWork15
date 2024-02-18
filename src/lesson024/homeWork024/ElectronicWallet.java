/*
 * created by Max$
 */


package lesson024.homeWork024;

import java.util.Scanner;

public class ElectronicWallet implements PaymentSystem {
    private int kundenId;
    private double kundenBalance;

    private double balanceProgamista;


    public ElectronicWallet(int kundenId, double kundenBalance) {
        this.kundenId = kundenId;
        this.kundenBalance = kundenBalance;
    }

    @Override
    public double transferMoney(double sum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер клиента, которому хотите отправить деньги!");
        int kundenIdNue = scanner.nextInt();
        if (kundenBalance > sum) {
            System.out.println("Ваши денежки в размере: " + sum + " c Вашего счета: " + kundenId + " переведены на нужный счёт " + kundenIdNue);
            kundenBalance = kundenBalance - sum;
            balanceProgamista = balanceProgamista + sum;
            System.out.println("Спасибо, друг!");
            checkBalance();
        } else {
            System.out.println("Денег не хватает!!Пополните баланс!!");
            checkBalance();
        }return kundenBalance;
    }

    @Override
    public double withdrawMoney(double sum) {
        if (kundenBalance > sum) {
            System.out.println("Ваши денежки в размере: " + sum + " c Вашего счета: " + kundenId + " сняты успещно!");
            kundenBalance = kundenBalance - sum;
            balanceProgamista = balanceProgamista + sum;
            System.out.println("Спасибо, друг!");
            checkBalance();
        } else {
            System.out.println("Денег не хватает!!Пополните баланс!!");
            checkBalance();


        }
        return kundenBalance;
    }

        @Override
        public double checkBalance () {
            System.out.println("На вашем балансе " + kundenBalance + " денег!");
            return kundenBalance;
        }
    }
