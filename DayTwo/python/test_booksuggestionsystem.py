import random
import unittest
import booksuggestionsystem

class DisplayMenuFunction(unittest.TestCase): 

    def test_that_display_menu_functions_will_return_menu_when_called(self):

        booksuggestionsystem.display_menu()


class GetBookSuggestionFunction(unittest.TestCase):

    def test_that_when_list_is_empty_then_raise_value_error(self):

        books = []

        self.assertRaises(ValueError, booksuggestionsystem.get_book_suggestion, books)

    def test_that_when_list_is_not_empty_then_a_book_is_suggested_at_random(self):

        books = ["The Client", "Gone Girl", "Purple Hibiscus", "Blink Of An Eye"]
        random.seed(1)

        self.assertEqual("The Client", booksuggestionsystem.get_book_suggestion(books))


class IsPageSuggestionWithinRangeFunction(unittest.TestCase):
    
    def test_that_when_page_selection_range_is_1_to_100_then_return_true_if_randomly_suggested_page_falls_within_range(self):

        is_within_range = booksuggestionsystem.is_page_suggestion_within_range()
        
        self.assertTrue(is_within_range)


class AddBookFunction(unittest.TestCase):

    def test_that_when_a_new_book_is_added_then_return_book_added_successfully_message(self):
    
        books = []
        title = "Life At Semicolon"
        expected = "Book added successfully"

        self.assertEqual(expected, booksuggestionsystem.add_book(title, books))

    def test_that_when_an_already_existing_book_is_added_then_raise_value_error(self):
    
        books = ["Life At Semicolon"]
        title = "Life At Semicolon"

        self.assertRaises(ValueError, booksuggestionsystem.add_book, title, books)

    def test_that_when_an_already_existing_book_written_in_uppercase_is_added_then_raise_value_error(self):
    
        books = ["Life At Semicolon"]
        title = "LIFE AT SEMICOLON"

        self.assertRaises(ValueError, booksuggestionsystem.add_book, title, books)

    def test_that_when_an_already_existing_book_written_in_lowercase_is_added_then_raise_value_error(self):
    
        books = ["Life At Semicolon"]
        title = "life at semicolon"

        self.assertRaises(ValueError, booksuggestionsystem.add_book, title, books)


class RemoveBookFunction(unittest.TestCase):

    def test_that_when_an_old_book_is_removed_then_return_book_removed_succesfully_message(self):

        books = ["Life At Semicolon"]
        title = "Life At Semicolon"
        expected = "Book removed successfully"

        self.assertEqual(expected, booksuggestionsystem.remove_book(title, books))        

    def test_that_when_an_old_book_written_in_uppercase_is_removed_then_return_book_removed_succesfully_message(self):

        books = ["Life At Semicolon"]
        title = "LIFE AT SEMICOLON"
        expected = "Book removed successfully"

        self.assertEqual(expected, booksuggestionsystem.remove_book(title, books)) 

    def test_that_when_an_old_book_written_in_lowercase_is_removed_then_return_book_removed_succesfully_message(self):

        books = ["Life At Semicolon"]
        title = "life at semicolon"
        expected = "Book removed successfully"

        self.assertEqual(expected, booksuggestionsystem.remove_book(title, books))    
   
    def test_that_when_a_book_that_does_not_exist_is_removed_then_raise_value_error(self):
    
        books = ["Life At Semicolon"]
        title = "No Passion For Tech"

        self.assertRaises(ValueError, booksuggestionsystem.remove_book, title, books)


class UpdateBookFunction(unittest.TestCase):

    def test_that_when_old_book_is_updated_then_return_book_updated_message(self):

        books = ["Life At Semicolon"]
        old_title = "Life At Semicolon"
        new_title = "No Life At Semicolon"
        expected = "Book updated successfully"

        self.assertEqual(expected, booksuggestionsystem.update_book(old_title, new_title, books)) 

    def test_that_when_old_ook_title_does_not_exist_the_raise_value_error(self):  

        books = ["Life At Semicolon"]
        old_title = "No Passion For Tech"
        new_title = ""

        self.assertRaises(ValueError, booksuggestionsystem.update_book, old_title, new_title, books)


class ShowBooksFunction(unittest.TestCase):

    def test_that_when_show_books_function_will_return_list_of_books_when_called(self):

        books = ["Life At Semicolon", "The Client", "Purple Hibiscus", "Blink Of An Eye"]

        booksuggestionsystem.show_books(books)

               

        
