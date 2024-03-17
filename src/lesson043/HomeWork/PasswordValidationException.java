/*
 * created by max$
 */


package lesson043.HomeWork;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception: " + super.getMessage();
    }
}
