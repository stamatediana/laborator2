package ro.ulbs.lab3;

public class Main {
    public static void main(String[] args) {

        PasswordMaker passwordMaker1 = PasswordMaker3.getInstance("JohnDoe");
        String password1 = passwordMaker1.getPassword();
        System.out.println("Generated password: " + password1);

        PasswordMaker passwordMaker2 = PasswordMaker3b.getInstance("JaneDoe");
        String password2 = passwordMaker2.getPassword();
        System.out.println("Generated password: " + password2);


        System.out.println("getInstance was called " + PasswordMaker3.getAccessCount() + " times.");
    }
}
