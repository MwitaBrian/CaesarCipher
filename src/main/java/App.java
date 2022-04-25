import models.Cipher;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner shiftKey = new Scanner(System.in);
        Cipher newCipher = new Cipher();

        System.out.println("Welcome to Caesar Cipher Program.");
        System.out.println("Please enter the Text you would like to Encrypt:");
        String userInput = input.nextLine();

        System.out.println("Enter shift Key: (1-25)");
        int shift = shiftKey.nextInt();

        String EncryptedText = newCipher.encrypt(userInput);
        System.out.println(EncryptedText);
    }
}
