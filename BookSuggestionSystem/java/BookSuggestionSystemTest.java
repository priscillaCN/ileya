import java.util.ArrayList;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;


public class BookSuggestionSystemTest {

    ArrayList<String> books;
    Random testRandom;

    @BeforeEach
    void setUp(){
        books  = new ArrayList<>();

    }

    @Test
    public void testThatDisplayMenuFunctionWwillReturnMenuWhenCalled() {

        BookSuggestionSystem.displayMenu();

    }


    @Test
    public void testThatWhenListIsEmptyThenThrowAnIllegalArgumentException() {
    
        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.getBookSuggestion(books, testRandom));

    }


    @Test
    public void testThatWhenListIsNotEmptyThenABookIsSuggestedAtRandom() {
   
        books.add("The Client");
        books.add("Gone Girl");
        books.add("Purple Hibiscus");
        books.add("Blink Of An Eye");

        String selectedBook = "Gone Girl";
        int randomIndex = books.indexOf(selectedBook);
        testRandom =  new Random(randomIndex);
    
        assertEquals(selectedBook, BookSuggestionSystem.getBookSuggestion(books, testRandom));

        selectedBook = "Blink Of An Eye";
        randomIndex = books.indexOf(selectedBook);
        testRandom =  new Random(randomIndex);
    
        assertEquals(selectedBook, BookSuggestionSystem.getBookSuggestion(books, testRandom));

    }



    @Test
    public void testThatWhenPageSelectionRangeIs1To100ThenReturnTrueIfRandomlySuggestedPageFallsWithinRange() {
        
        testRandom = new Random();

        boolean isWithinRange = BookSuggestionSystem.isPageSuggestionWithinRange(testRandom);

        assertTrue(isWithinRange);

    }


    @Test
    public void testThatWhenANewBookIsAddedThenReturnBookAddedSuccessfullyMessage() {

        String title = "Life At Semicolon";
        String expected = "Book added successfully";

        assertEquals(expected, BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void testThatWhenAnAlreadyExistingBookIsAddedThenThrowAnIllegalArgumentException() {

        books.add("Life At Semicolon");
        String title = "Life At Semicolon";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void testThatWhenAnAlreadyExistingBookWrittenInUppercaseIsAddedThenThrowAnIllegalArgumentException() {

        books.add("Life At Semicolon");
        String title = "LIFE AT SEMICOLON";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void testThatWhenAnAlreadyExistingBookWrittenInLowercaseIsAddedThenThrowAnIllegalArgumentException() {

        books.add("Life At Semicolon");
        String title = "life at semicolon";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void testThatWhenAnOldBookIsRemovedThenReturnBookRemovedSuccesfullyMessage() {

        books.add("Life At Semicolon");
        String title = "Life At Semicolon";
        String expected = "Book removed successfully";

        assertEquals(expected, BookSuggestionSystem.removeBook(title, books));


    }


    @Test
    public void testThatWhenAnOldBookWrittenInUppercaseIsRemovedThenReturnBookRemovedSuccesfullyMessage() {

        books.add("Life At Semicolon");
        String title = "LIFE AT SEMICOLON";
        String expected = "Book removed successfully";

        assertEquals(expected, BookSuggestionSystem.removeBook(title, books));


    }


    @Test
    public void testThatWhenAnOldBookWrittenInLowercaseIsRemovedThenReturnBookRemovedSuccesfullyMessage() {

        books.add("Life At Semicolon");
        String title = "life at semicolon";
        String expected = "Book removed successfully";

        assertEquals(expected, BookSuggestionSystem.removeBook(title, books));


    }


    @Test
    public void testThatWhenABookThatDoesNotExistIsRemovedThenThrowAnIllegalArgumentException() {

        books.add("Life At Semicolon");
        String title = "No Passion For Tech";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.removeBook(title, books));

    }


    @Test
    public void testThatWhenOldBookIsUpdatedThenReturnBookUpdatedMessage() {

        books.add("Life At Semicolon");
        String oldTitle = "Life At Semicolon";
        String newTitle = "No Life At Semicolon";
        String expected = "Book updated successfully";

        assertEquals(expected, BookSuggestionSystem.updateBook(oldTitle, newTitle, books));


    }


    @Test
    public void testThatWhenOldBookTitleDoesNotExistThenThrowAnIllegalArgumentException() {

        books.add("Life At Semicolon");
        String oldTitle = "No Passion For Tech";
        String newTitle = "";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.updateBook(oldTitle, newTitle, books));

    }

    @Test
    public void testThatShowListOfBooksFunctionWillReturnListOfBooksWhenCalled() {

        books.add("Life At Semicolon");
        books.add("The Client");
        books.add("Purple Hibiscus");
        books.add("Blink Of An Eye");

        BookSuggestionSystem.showListOfBooks(books);

    }
    

}
