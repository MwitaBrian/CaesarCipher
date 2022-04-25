package models;
public class Cipher {

    Character[] alphabet = {'A', 'B', 'C','D', 'E', 'F','G', 'H', 'I','J', 'K', 'L','M', 'N', 'O','P', 'Q', 'R','S', 'T', 'U','V', 'W', 'X','Y', 'Z'};
    public String encrypt(String userInput){
        String EncryptedText = "";

        int length = userInput.length();
        for (int i = 0; i < length; i++) {
            char letters = userInput.charAt(i);

        }
        return EncryptedText;
    }
}
