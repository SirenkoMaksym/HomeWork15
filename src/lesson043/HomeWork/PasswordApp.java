/*
 * created by max$
 */


package lesson043.HomeWork;

import lesson043.EmailValidateException;
import lesson043.EmailValidator;

public class PasswordApp {
    public static void main(String[] args) {
        String password = "ffgdXX34!!bhtyr";

        try {
            PasswordValidator.validate(password);
            System.out.println("Валидация password пройдена!");
        } catch (PasswordValidationException e) {
            System.out.println("Вы ввели не верный password!");
           System.out.println(e.getMessage());
        }

    }
}
