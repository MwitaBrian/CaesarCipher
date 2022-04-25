package models;
public class Cipher {

    int shift = 7;
    Character[] alphabet = {'A', 'B', 'C','D', 'E', 'F','G', 'H', 'I','J', 'K', 'L','M', 'N', 'O','P', 'Q', 'R','S', 'T', 'U','V', 'W', 'X','Y', 'Z'};
    public String encrypt(String userInput){
        String EncryptedText = "";

        int length = userInput.length();
        for (int i = 0; i < length; i++) {
            char letters = userInput.charAt(i);
            if (Character.isLetter(letters)) {
                if (Character.isLowerCase(letters)){
                    char newLetters = (char) (letters + shift);
                    if (newLetters > 'z'){
                        EncryptedText += (char)(letters - (26 - shift));
                    }
                    else {
                        EncryptedText += newLetters;
                    }
                }
                else if (Character.isUpperCase(letters)){
                    char newLetters = (char) (letters + shift);
                    if (newLetters > 'Z'){
                        EncryptedText += (char)(letters - (26 - shift));
                    }
                    else {
                        EncryptedText += newLetters;
                    }
                }
            } else {
                EncryptedText += letters;

            }
        }
        return EncryptedText;
    }
}
