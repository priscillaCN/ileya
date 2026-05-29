function getEncryptedMessage(userInput) {

    let letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    const alphabet = letters.split('');
    const word = userInput.split('');

    const encrypt = [];
    let cipherIndex = 0;
    let count = 0;

    for(let userIndex = 0; userIndex < word.length; userIndex++) {

        for(let alphabetIndex = 0; alphabetIndex < alphabet.length; alphabetIndex++) {

            if(word[userIndex].toLowerCase() === alphabet[alphabetIndex].toLowerCase()) {
                cipherIndex = (alphabetIndex + 3) % 27;
                encrypt[count] = alphabet[cipherIndex];
                count++;  
            }

        }

    }

    let result = encrypt.join('');
    return result;

}


function getDecryptedMessage(userInput) {

    let letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    const alphabet = letters.split('');
    const word = userInput.split('');

    const decrypt = [];
    let decipherIndex = 0;
    let count = 0;

    for(let userIndex = 0; userIndex < word.length; userIndex++) {

        for(let alphabetIndex = 0; alphabetIndex < alphabet.length; alphabetIndex++) {

            if(word[userIndex].toLowerCase() === alphabet[alphabetIndex].toLowerCase()) {
                decipherIndex = (alphabetIndex - 3 + 27) % 27;
                decrypt[count] = alphabet[decipherIndex];
                count++;  
            }

        }

    }

    let result = decrypt.join('');
    return result;

}

module.exports = {getEncryptedMessage, getDecryptedMessage}
