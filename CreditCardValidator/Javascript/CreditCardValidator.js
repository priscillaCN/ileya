function getCardNumberArray (creditCardNumber) {
    
    const cardDigits = creditCardNumber.split('');
    const cardNumber = [];

    let index = 0;
    let intValue = 0;

    for (let digit of cardDigits) {
        intValue = digit - '0';
        cardNumber[index] = intValue;
        index++;
    }

    return cardNumber;

}

function getCardType (cardNumber) {

    let cardType = "";
        
    if(cardNumber[0] === 4) cardType = "Visa Card";
    else if(cardNumber[0] === 5) cardType = "MasterCard";
    else if(cardNumber[0] === 6) cardType = "Discover Card";
    else if(cardNumber[0] === 3 && cardNumber[1] === 7) cardType = "American Express Card";
    else cardType = "invalid card type";

    return cardType;
        
}


function doubleEverySecondDigit (cardNumber) {

    let count = 0;
    let sum = 0;

    for(let index = cardNumber.length - 1; index >= 0; index--) {

        count++;
        if (count % 2 === 0) sum += (cardNumber[index] * 2);
    }

    return sum;
}


function addEveryDigitInOddPlaces (cardNumber) {

    let count = 0;
    let sum = 0;

    for(let index = cardNumber.length - 1; index >= 0; index--) {

        count++;
        if (count % 2 != 0) sum += cardNumber[index];
    }

    return sum;
}

    
function validateCardNumber (cardNumber) {

    let validityStatus = "";

    let cardNumberLength = cardNumber.length;
    let sumOfDoubledDigits = doubleEverySecondDigit (cardNumber);
    let sumOfDigitsInOddPlaces = addEveryDigitInOddPlaces (cardNumber);

    let sum = sumOfDoubledDigits + sumOfDigitsInOddPlaces;

    if(cardNumberLength < 13 || cardNumberLength > 16) validityStatus = "Invalid";

    if(sum % 10 === 0) validityStatus = "Valid";
    else validityStatus = "Invalid";

    return validityStatus;
}
            

const prompt = require("prompt-sync")();

console.log("\nHello, kindly enter card number to verify");
let creditCardNumber = String(prompt(""));

const cardNumberArray = getCardNumberArray (creditCardNumber);

console.log("\n***************************************************\n");
console.log("**Credit Card Type: " + getCardType (cardNumberArray));
console.log("\n**Credit Card Number: " + creditCardNumber);
console.log("\n**Credit Card Digit Length: " + cardNumberArray.length);
console.log("\n**Credit Card Validity Status: " + validateCardNumber (cardNumberArray));
console.log("\n***************************************************\n");

