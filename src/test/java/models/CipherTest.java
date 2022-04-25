package models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    @Test
    @DisplayName("Return Empty String")
    public void encrypt_emptyCipheredStringIsReturned_String(){
        Cipher cipher = new Cipher();
        String CipherText = "";
        assertEquals(CipherText, cipher.encrypt());
    }

}