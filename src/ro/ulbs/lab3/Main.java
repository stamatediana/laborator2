package ro.ulbs.lab3;

public class Main {
    public static void main(String[] args) {
        PasswordMaker passwordMaker = new PasswordMaker("JohnDoe");
        String password = passwordMaker.getPassword();
        System.out.println("Generated password: " + password);
    }
}
