const {getEncryptedMessage, getDecryptedMessage} = require('./caesar-cipher-function')

test("test that when user inputs a word in uppercase then return encrypted word", () => {

    let text = "SEMICOLON"

    expect(getEncryptedMessage(text)).toBe("VHPLFRORQ");

})


test("test that when user inputs a word in lowercase then return encrypted word", () => {

    let text = "semicolon"

    expect(getEncryptedMessage(text)).toBe("VHPLFRORQ");

})


test("test that when user inputs a word in mixedcase then return encrypted word", () => {

    let text = "SemiColoN"

    expect(getEncryptedMessage(text)).toBe("VHPLFRORQ");

})


test("test that when user inputs a sentence in uppercase then return encrypted sentence", () => {

    let text = "I LOVE RICE"

    expect(getEncryptedMessage(text)).toBe("LCORYHCULFH");

})


test("test that when user inputs a sentence in lowercase then return encrypted sentence", () => {

    let text = "i love rice"

    expect(getEncryptedMessage(text)).toBe("LCORYHCULFH");

})


test("test that when user inputs a sentence in mixedcase then return encrypted sentence", () => {

    let text = "I LovE RicE"

    expect(getEncryptedMessage(text)).toBe("LCORYHCULFH");

})


test("test that when user inputs an encrypted word in uppercase then return decrypted word", () => {

    let text = "VHPLFRORQ"

    expect(getDecryptedMessage(text)).toBe("SEMICOLON");

})


test("test that when user inputs an encrypted word in lowercase then return decrypted word", () => {

    let text = "vhplfrorq"

    expect(getDecryptedMessage(text)).toBe("SEMICOLON");

})


test("test that when user inputs an encrypted word in mixedcasw then return decrypted word", () => {

    let text = "VhplFrorQ"

    expect(getDecryptedMessage(text)).toBe("SEMICOLON");

})


test("test that when user inputs an encrypted sentence in uppercase then return decrypted sentence", () => {

    let text = "LCORYHCULFH"

    expect(getDecryptedMessage(text)).toBe("I LOVE RICE");

})


test("test that when user inputs an encrypted sentence in lowercase then return decrypted sentence", () => {

    let text = "lcoryhculfh"

    expect(getDecryptedMessage(text)).toBe("I LOVE RICE");

})

test("test that when user inputs an encrypted sentence in mixedcase then return decrypted sentence", () => {

    let text = "LcOryHcUlfH"

    expect(getDecryptedMessage(text)).toBe("I LOVE RICE");

})
