package models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    @Test
    @DisplayName("Return Empty String")
    public void encrypt_emptyCipheredStringIsReturned_String(){
        Cipher cipher = new Cipher();
        String EncryptedText = "";
        assertEquals(EncryptedText, cipher.encrypt(""));
    }

    @Test
    @DisplayName("For Loop Returns characters from userInput")
    public void encrypt_forLoopReturnsCharactersFromUserInput_int(){
        Cipher cipher = new Cipher();
        String userInput = "Mwita";
        int length = userInput.length();
        for (int i = 0; i < length; i++){
            char letters = userInput.charAt(i);
            assertEquals(5, length);
        }
    }

    @Test
    @DisplayName("Test that letters variable is a letter.")
    public void encrypt_checkCharacterInStringIsLetter_boolean(){
        Cipher cipher = new Cipher();
        String EncryptedText = "";
        String userInput = "Mwita";
        int length = userInput.length();
        for (int i = 0; i < length; i++){
            char letters = userInput.charAt(i);
            if (Character.isLetter(letters)){
                if (Character.isLowerCase(letters)){

                }
            }else {
                EncryptedText += letters;
            }
            assertEquals(true, Character.isLetter(letters));
        }
    }

    @Test
    @DisplayName("decrypt Method Returns String")
    public void decrypt_decryptMethodReturnsString_String(){
        Cipher cipher = new Cipher();
        assertEquals(true, cipher.decrypt()instanceof String);
    }

    @Test
    @DisplayName("decrypt Method returns same String as userInput")
    public void decrypt_returnsSameUserInput_String(){
        int shift = 7;
        Cipher cipher = new Cipher();
        String userInput = "Mwita";
        String newUserInput = "";
        String EncryptedText = cipher.encrypt(userInput);
        int length = EncryptedText.length();
        for (int i = 0; i < length; i++){
            char letters = EncryptedText.charAt(i);
            if (Character.isLetter(letters)){
                if (Character.isLowerCase(letters)){
                    char newLetters = (char) ('a' - (letters + 'a' - shift) % 26);
                    newUserInput += newLetters;
                }
                else if (Character.isUpperCase(letters)){
                    char newLetters = (char) ('A' - (letters + 'A' - shift) % 26);
                    newUserInput += newLetters;
                }
            }
            else {
                newUserInput += letters;
            }
        }
        assertEquals(true, cipher.decrypt().equals(userInput));
    }







}
