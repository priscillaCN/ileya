import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void givenGetEncryption_WhenInputIsOneWordInUppercase_thenReturnEncryptedWord() {

        String text = "SEMICOLON";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryption(text)); 

    }


    @Test
    public void givenGetEncryption_WhenInputIsOneWordInLowercase_thenReturnEncryptedWord() {

        String text = "semicolon";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryption(text)); 

    }


    @Test
    public void givenGetEncryption_WhenInputIsOneWordInMixedcase_thenReturnEncryptedWord() {

        String text = "SemiColoN";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryption(text)); 

    }


    @Test
    public void givenGetDecryption_WhenInputIsOneWordInUppercase_thenReturnDecryptedWord() {

        String text = "VHPLFRORQ";

        assertEquals("SEMICOLON", CaesarCipher.getDecryption(text)); 

    }



    @Test
    public void givenGetDecryption_WhenInputIsOneWordInLowercase_thenReturnDecryptedWord() {

        String text = "vhplfrorq";

        assertEquals("SEMICOLON", CaesarCipher.getDecryption(text)); 

    }


    @Test
    public void givenGetDecryption_WhenInputIsOneWordInMixedcase_thenReturnDecryptedWord() {

        String text = "VhplFrorQ";

        assertEquals("SEMICOLON", CaesarCipher.getDecryption(text)); 

    }


}
