import unittest
import caesarcipher

class GetEncryptedMessageFunction(unittest.TestCase):

    def test_that_when_user_inputs_a_word_in_uppercase_then_return_encrypted_word(self):

        text = "SEMICOLON"

        self.assertEqual("VHPLFRORQ", caesarcipher.get_encrypted_message(text))

    def test_that_when_user_inputs_a_word_in_lowercase_then_return_encrypted_word(self):

        text = "semicolon"

        self.assertEqual("VHPLFRORQ", caesarcipher.get_encrypted_message(text))

    def test_that_when_user_inputs_a_word_in_mixedcase_then_return_encrypted_word(self):

        text = "SemiColoN"

        self.assertEqual("VHPLFRORQ", caesarcipher.get_encrypted_message(text))

    def test_that_when_user_inputs_a_sentence_in_uppercase_then_return_encrypted_sentence(self):

        text = "I LOVE RICE"

        self.assertEqual("LCORYHCULFH", caesarcipher.get_encrypted_message(text))

    def test_that_when_user_inputs_a_sentence_in_lowercase_then_return_encrypted_sentence(self):

        text = "i love rice"

        self.assertEqual("LCORYHCULFH", caesarcipher.get_encrypted_message(text))

    def test_that_when_user_inputs_a_sentence_in_mixedcase_then_return_encrypted_sentence(self):

        text = "I LovE RicE"

        self.assertEqual("LCORYHCULFH", caesarcipher.get_encrypted_message(text))


class GetDecryptedMessageFunction(unittest.TestCase):

    def test_that_when_user_inputs_an_encryptrd_word_in_uppercase_then_return_decrypted_word(self):

        text = "VHPLFRORQ"

        self.assertEqual("SEMICOLON", caesarcipher.get_decrypted_message(text))

    def test_that_when_user_inputs_an_encrypted_word_in_lowercase_then_return_decrypted_word(self):

        text = "vhplfrorq"

        self.assertEqual("SEMICOLON", caesarcipher.get_decrypted_message(text))

    def test_that_when_user_inputs_an_encrypted_word_in_mixedcase_then_return_decrypted_word(self):

        text = "VhplFrorQ"

        self.assertEqual("SEMICOLON", caesarcipher.get_decrypted_message(text))

    def test_that_when_user_inputs_an_encypted_sentence_in_uppercase_then_return_decrypted_sentence(self):

        text = "LCORYHCULFH"

        self.assertEqual("I LOVE RICE", caesarcipher.get_decrypted_message(text))

    def test_that_when_user_inputs_an_encrypted_sentence_in_lowercase_then_return_decrypted_sentence(self):

        text = "lcoryhculfh"

        self.assertEqual("I LOVE RICE", caesarcipher.get_decrypted_message(text))

    def test_that_when_user_inputs_an_encrypted_sentence_in_mixedcase_then_return_decrypted_sentence(self):

        text = "LcOryHcUlfH"

        self.assertEqual("I LOVE RICE", caesarcipher.get_decrypted_message(text))
