/*
 * created by max$
 */


package lesson043.HomeWork;

public class PasswordValidator {
    public static void validate(String password) throws PasswordValidationException {
        //длина
        if (password.length() <= 8) {throw new PasswordValidationException("Длина маловата!");
        }

        boolean x = false;
        boolean y = false;
        boolean z = false;
        boolean k = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                x = true;
            }
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                y = true;
            }

        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                z = true;
            }

        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            boolean isCharValid = c == '!'
                    || c == '%'
                    || c == '$'
                    || c == '@'
                    || c == '&'
                    || c == '*'
                    || c == '('
                    || c == ')'
                    || c == '['
                    || c == ']';
            if (isCharValid == true) {
                      k = true;
            }
        }
        if (x == false) {
            throw new PasswordValidationException("Надо хоть одну маленькую!");
        }
        if (y == false) {
            throw new PasswordValidationException("Надо хоть и одну большую!");
        }
        if (z == false) {
            throw new PasswordValidationException("А цифру?");
        }
        if (k == false) {throw new PasswordValidationException("И спецсимвол!");}
        // throw  (x == true && y == true && z == true && k == true);

    }
}
