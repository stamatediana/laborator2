package ro.ulbs.lab3;

import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 7;
    private final String magicString;
    private final String name;

    public PasswordMaker(String name) {
        this.name = name;
        this.magicString = StringRandomizer.generateRandomString(20);
    }

    public String getPassword() {
        Random random = new Random();

        String randomPart = StringRandomizer.generateRandomString(MAGIC_NUMBER);
        StringBuilder magicStringPart = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(magicString.length());
            magicStringPart.append(magicString.charAt(index));
        }

        String nameLength = String.valueOf(name.length());
        int randomNumber = random.nextInt(51);

        return randomPart + magicStringPart.toString() + nameLength + randomNumber;
    }
}
