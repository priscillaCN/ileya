public class CaesarCipher {

    public static String getEncryptedMessage(String userInput) {

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        char [] alphabet = letters.toCharArray();
        char [] word = userInput.toCharArray();

        char [] encrypt = new char [word.length];
        int cipherIndex = 0;
        int count = 0;

        for(int userIndex = 0; userIndex < word.length; userIndex++) {

            for(int alphabetIndex = 0; alphabetIndex < alphabet.length; alphabetIndex++) {

                if(Character.toLowerCase(word[userIndex]) == Character.toLowerCase(alphabet[alphabetIndex])) {
                    cipherIndex = (alphabetIndex + 3) % 27;
                    encrypt[count] = alphabet[cipherIndex];
                    count++;          
                }

            }

        }

        String result = new String(encrypt);
        return result;

    }



    public static String getDecryptedMessage(String userInput) {


        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        char [] alphabet = letters.toCharArray();
        char [] word = userInput.toCharArray();

        char [] decrypt = new char [word.length];
        int decipherIndex = 0;
        int count = 0;

        for(int userIndex = 0; userIndex < word.length; userIndex++) {

            for(int alphabetIndex = 0; alphabetIndex < alphabet.length; alphabetIndex++) {

                if(Character.toLowerCase(word[userIndex]) == Character.toLowerCase(alphabet[alphabetIndex])) {
                    decipherIndex = (alphabetIndex - 3 + 27) % 27;
                    decrypt[count] = alphabet[decipherIndex];
                    count++;          
                }

            }

        }

        String result = new String(decrypt);
        return result;

    }

}

