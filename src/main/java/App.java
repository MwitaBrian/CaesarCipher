import models.Cipher;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner shiftKey = new Scanner(System.in);
        Cipher cipher = new Cipher();

        System.out.println("Welcome to Caesar Cipher Program.");
        System.out.println("Please enter the Text you would like to Encrypt:");
        String userInput = input.nextLine();

        System.out.println("Enter shift Key: (1-25)");
        int shift = shiftKey.nextInt();

        String EncryptedText = cipher.encrypt(userInput);
        System.out.println("Your encrypted message is "+ EncryptedText);

        System.out.println("Type 'decipher' in order to revert back to original...");
        String decipher = input.nextLine();

        if (decipher.equals("decipher")){
            String decipheredText = cipher.decrypt(EncryptedText);
            System.out.println("Your deciphered text: " + decipheredText);
        }
        else {
            System.out.println("Wrong Input! Try again");
        }
    }
}
