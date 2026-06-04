import java.util.Scanner;

public class CreditCardValidator {

    public static int [] getCardNumberArray (String creditCardNumber) {
    
        char [] cardDigits = creditCardNumber.toCharArray();
        int [] cardNumber = new int [cardDigits.length];

        int index = 0;
        int intValue = 0;

        for (char digit : cardDigits) {
            intValue = digit - '0';
            cardNumber[index] = intValue;
            index++;
        }

        return cardNumber;

    }

    public static String getCardType (int [] cardNumber) {

        String cardType = "";
        
        if(cardNumber[0] == 4) cardType = "Visa Card";
        else if(cardNumber[0] == 5) cardType = "MasterCard";
        else if(cardNumber[0] == 6) cardType = "Discover Card";
        else if(cardNumber[0] == 3 && cardNumber[1] == 7) cardType = "American Express Card";
        else cardType = "invalid card type";

        return cardType;
        
    }


    public static int doubleEverySecondDigit (int [] cardNumber) {

        int count = 0;
        int sum = 0;

        for(int index = cardNumber.length - 1; index >= 0; index--) {

            count++;
            if (count % 2 == 0) sum += (cardNumber[index] * 2);
        }

        return sum;
    }


    public static int addEveryDigitInOddPlaces (int [] cardNumber) {

        int count = 0;
        int sum = 0;

        for(int index = cardNumber.length - 1; index >= 0; index--) {

            count++;
            if (count % 2 != 0) sum += cardNumber[index];
        }

        return sum;
    }

    
    public static String validateCardNumber (int [] cardNumber) {

        String validityStatus = "";
        int cardNumberLength = cardNumber.length;

        int sumOfDoubledDigits = doubleEverySecondDigit (cardNumber);
        int sumOfDigitsInOddPlaces = addEveryDigitInOddPlaces (cardNumber);

        int sum = sumOfDoubledDigits + sumOfDigitsInOddPlaces;

        if(cardNumberLength < 13 || cardNumberLength > 16) validityStatus = "Invalid";

        if(sum % 10 == 0) validityStatus = "Valid";
        else validityStatus = "Invalid";

        return validityStatus;
    }
            

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("\nHello, kindly enter card number to verify");
        String creditCardNumber = userInput.nextLine();

        int [] cardNumberArray = getCardNumberArray (creditCardNumber);

        System.out.println("\n***************************************************\n");
        System.out.println("**Credit Card Type: " + getCardType (cardNumberArray));
        System.out.println("\n**Credit Card Number: " + creditCardNumber);
        System.out.println("\n**Credit Card Digit Length: " + cardNumberArray.length);
        System.out.println("\n**Credit Card Validity Status: " + validateCardNumber (cardNumberArray));
        System.out.println("\n***************************************************\n");

    }

}
