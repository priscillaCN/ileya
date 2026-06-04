import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarCipherTest {

    @Test
    public void testThatWhenUserInputsAWordInUppercaseThenReturnEncryptedWord() {

        String text = "SEMICOLON";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsAWordInLowercaseThenReturnEncryptedWord() {

        String text = "semicolon";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsAWordInMixedcaseThenReturnEncryptedWord() {

        String text = "SemiColoN";

        assertEquals("VHPLFRORQ", CaesarCipher.getEncryptedMessage(text)); 

    }

    @Test
    public void testThatWhenUserInputsASentenceInUppercaseThenReturnEncryptedSentence() {

        String text = "I LOVE RICE";

        assertEquals("LCORYHCULFH", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsASentenceInLowercaseThenReturnEncryptedSentence() {

        String text = "i love rice";

        assertEquals("LCORYHCULFH", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsASentenceInMixedcaseThenReturnEncryptedSentence() {

        String text = "I LovE RicE";

        assertEquals("LCORYHCULFH", CaesarCipher.getEncryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsAnEncryptedWordInUppercaseThenReturnDecryptedWord() {

        String text = "VHPLFRORQ";

        assertEquals("SEMICOLON", CaesarCipher.getDecryptedMessage(text)); 

    }



    @Test
    public void testThatWhenUserInputsAnEncryptedWordInLowercaseThenReturnDecryptedWord() {

        String text = "vhplfrorq";

        assertEquals("SEMICOLON", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsAnEncryptedWordInMixedcaseThenReturnDecryptedWord() {

        String text = "VhplFrorQ";

        assertEquals("SEMICOLON", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsAnEncyptedSentenceInUppercaseThenReturnDecryptedSentence() {

        String text = "LCORYHCULFH";

        assertEquals("I LOVE RICE", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsAnEncryptedSentenceInLowercaseThenReturnDecryptedSentence() {

        String text = "lcoryhculfh";

        assertEquals("I LOVE RICE", CaesarCipher.getDecryptedMessage(text)); 

    }


    @Test
    public void testThatWhenUserInputsAnEncryptedSentenceInMixedcaseThenReturnDecryptedSentence() {

        String text = "LcOryHcUlfH";

        assertEquals("I LOVE RICE", CaesarCipher.getDecryptedMessage(text)); 

    }

}
