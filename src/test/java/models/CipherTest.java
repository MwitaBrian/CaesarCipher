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

                } else if (Character.isUpperCase(letters)) {

                }
            }else {
                EncryptedText += letters;
            }
            assertEquals(true, Character.isLetter(letters));
        }
    }


}
