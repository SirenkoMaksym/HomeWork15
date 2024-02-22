/*
 * created by max$
 */


package lesson027.persons;

public class Person {
    private String mail;

    private String password;

    public Person(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" + "mail='" + mail + '\'' + '}';
    }

    public String getMail() {

        return mail;
    }


    public void setMail(String mail) {
        if (isEmailValid(mail)) {
            this.mail = mail;
        }
    }

    private boolean isEmailValid(String mail) {

        if (mail == null || mail.isEmpty()) return false;

        int indexAt = mail.indexOf("@");
        if (indexAt <= 0 || indexAt != mail.indexOf('@')) return false;

        int indexFirstDotAfterAt = mail.indexOf('.', indexAt);

        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return false;
        if (mail.lastIndexOf('.') >= mail.length() - 2) return false;

        boolean isCharAlphabetic = Character.isAlphabetic(mail.charAt(0));
        if (!isCharAlphabetic) return false;


        for (int i = 0; i < mail.length(); i++) {

            char c = mail.charAt(i);

            boolean isCharValid = Character.isAlphabetic(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.' || c == '@';
            if (!isCharValid) return false;

        }
        return true;


    }

    public boolean isPasswordValid(String password) {
        //длина
        if (password.length() <= 8) return false;
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
            if (isCharValid == true)  k = true;
        }

        if (!(x == true && y == true && z == true && k == true)) {
            return false;
        }
        return true;

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }
}
