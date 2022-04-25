package models;
public class Cipher {

    private int shift = 7;
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

    public String decrypt(String encodedText){
        String userInput = "Mwita";
        String newUserInput = "";

        int length = encodedText.length();
        for (int i = 0; i < length; i++){
            char ch = encodedText.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char newCh = (char) (ch - shift);
                    if (newCh < 'a'){
                        newUserInput += (char)(ch + (26 - shift));
                    }
                    else {
                        newUserInput += newCh;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char newCh = (char) (ch - shift);
                    if (newCh < 'A'){
                        newUserInput += (char)(ch + (26 - shift));
                    }
                    else {
                        newUserInput += newCh;
                    }
                }
            }
            else {
                newUserInput += ch;
            }
        }
        return newUserInput;
    }
}
