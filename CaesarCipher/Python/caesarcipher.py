def get_encrypted_message(word): 

    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "
    cipher_index = 0
    encrypt = ""

    for user_index in range(len(word)): 

        for alphabet_index in range(len(alphabet)):

            if word[user_index].lower() == alphabet[alphabet_index].lower():
                cipher_index = (alphabet_index + 3) % 27
                encrypt += alphabet[cipher_index]           

    return encrypt


def get_decrypted_message(word): 

    alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "
    decipher_index = 0
    decrypt = ""

    for user_index in range(len(word)): 

        for alphabet_index in range(len(alphabet)):

            if word[user_index].lower() == alphabet[alphabet_index].lower():
                decipher_index = (alphabet_index - 3 + 27) % 27
                decrypt += alphabet[decipher_index]     

    return decrypt



