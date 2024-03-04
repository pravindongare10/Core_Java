package ByUsingThrowKeywordWeCanThrowUncheckException;

public class A {
    String username = "abc@gmail.com";
    String password = "abc@123";

    public boolean checkLogin(String inputUsername, String inputPassword) {
        if (inputUsername.equalsIgnoreCase(username) && inputPassword.equals(password))
            return true;
        return false;
    }

    public void login(String inputUsername, String inputPassword) {
        if (checkLogin(inputUsername, inputPassword)) {
            home();
        } else {
            throw new ArithmeticException("Invalid username or password");
        }
    }

    public void home() {
        System.out.println("Welcome page");
    }
}
