import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void givenGetEncryptedMessage_whenInputIsAWordInUppercase_thenReturnEncryptedWord() {

        String text = "SEMICOLON";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void givenGetEncryptedMessage_whenInputIsAWordInLowercase_thenReturnEncryptedWord() {

        String text = "semicolon";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void givenGetEncryptedMessage_whenInputIsAWordInMixedcase_thenReturnEncryptedWord() {

        String text = "SemiColoN";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryptedMessage(text)); 

    }

    @Test
    public void givenGetEncryptedMessage_whenInputIsASentenceInUppercase_thenReturnEncryptedSentence() {

        String text = "I LOVE RICE";

        assertEquals("LCORYHCULFH", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void givenGetEncryptedMessage_whenInputIsASentenceInLowercase_thenReturnEncryptedSentence() {

        String text = "i love rice";

        assertEquals("LCORYHCULFH", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void givenGetEncryptedMessage_whenInputIsASentenceInMixedcase_thenReturnEncryptedSentence() {

        String text = "I LovE RicE";

        assertEquals("LCORYHCULFH", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void givenGetDecryptedMessage_whenInputIsAWordInUppercase_thenReturnDecryptedWord() {

        String text = "VHPLFRORQ";

        assertEquals("SEMICOLON", CaesarCipher.getDecryptedMessage(text)); 

    }



    @Test
    public void givenGetDecryptedMessage_whenInputIsAWordInLowercase_thenReturnDecryptedWord() {

        String text = "vhplfrorq";

        assertEquals("SEMICOLON", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void givenGetDecryptedMessage_whenInputIsAWordInMixedcase_thenReturnDecryptedWord() {

        String text = "VhplFrorQ";

        assertEquals("SEMICOLON", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void givenGetDecryptedMessage_whenInputIsASentenceInUppercase_thenReturnDecryptedSentence() {

        String text = "LCORYHCULFH";

        assertEquals("I LOVE RICE", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void givenGetDecryptedMessage_whenInputIsASentenceInLowercase_thenReturnDecryptedSentence() {

        String text = "lcoryhculfh";

        assertEquals("I LOVE RICE", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void givenGetDecryptedMessage_whenInputIsASentenceInMixedcase_thenReturnDecryptedSentence() {

        String text = "LcOryHcUlfH";

        assertEquals("I LOVE RICE", CaesarCipher.getDecryptedMessage(text)); 

    }

}
