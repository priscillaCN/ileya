import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
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
        testRandom = new Random();
    }

    @Test
    public void givenDisplayMenu_whenInputIsMenu_thenDisplaySystemMenu() {

        BookSuggestionSystem.displayMenu(menu);

    }


    @Test
    public void givenGetBookSuggestion_whenInputIsAnEmptyArrayList_thenThrowAnIllegalArgumentException() {
    
        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.getBookSuggestion(books, testRandom));

    }


    @Test
    public void givenGetBookSuggestion_whenInputIsAnArrayListWithBooks_thenReturnRandomlySuggestedBook() {
   
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
    public void givenIsPageSuggestionWithinRange_whenInputIsRandomWithValue100_thenReturnTrue() {

        boolean isWithinRange = BookSuggestionSystem.isPageSuggestionWithinRange(testRandom);

        assertTrue(isWithinRange);

    }


    @Test
    public void givenAddBook_whenInputIsANewBook_thenReturnBookAddedMessage() {

        String title = "Life At Semicolon";
        String expected = "Book added successfully";

        assertEquals(expected, BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void givenAddBook_whenInputIsABookThatAlreadyExists_thenThrowAnIllegalArgumentException() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String title = "Life At Semicolon";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void givenAddBook_whenInputIsABookThatAlreadyExistsWrittenInUppercase_thenThrowAnIllegalArgumentException() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String title = "LIFE AT SEMICOLON";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void givenAddBook_whenInputIsABookThatAlreadyExistsWrittenInLowercase_thenThrowAnIllegalArgumentException() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String title = "life at semicolon";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.addBook(title, books));

    }


    @Test
    public void givenRemoveBook_whenInputIsABookThatAlreadyExists_thenReturnBookRemovedMessage() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String title = "Life At Semicolon";
        String expected = "Book removed successfully";

        assertEquals(expected, BookSuggestionSystem.removeBook(title, books));


    }


    @Test
    public void givenRemoveBook_whenInputIsABookThatAlreadyExistsWrittenInUppercase_thenReturnBookRemovedMessage() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String title = "LIFE AT SEMICOLON";
        String expected = "Book removed successfully";

        assertEquals(expected, BookSuggestionSystem.removeBook(title, books));


    }


    @Test
    public void givenRemoveBook_whenInputIsABookThatAlreadyExistsWrittenInLowercase_thenReturnBookRemovedMessage() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String title = "life at semicolon";
        String expected = "Book removed successfully";

        assertEquals(expected, BookSuggestionSystem.removeBook(title, books));


    }


    @Test
    public void givenRemoveBook_whenInputIsABookThatDoesNotExists_thenThrowAnIllegalArgumentException() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String title = "No Passion For Tech";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.removeBook(title, books));

    }


    @Test
    public void givenUpdateBook_whenOldTitleIsUpdated_thenReturnBookUpdatedMessage() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String oldTitle = "Life At Semicolon";
        String newTitle = "No Life At Semicolon";
        String expected = "Book updated successfully";

        assertEquals(expected, BookSuggestionSystem.updateBook(oldTitle, newTitle, books));


    }


    @Test
    public void givenUpdateBook_whenOldTitleDoesNotExists_thenThrowAnIllegalArgumentException() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon"));
        String oldTitle = "No Passion For Tech";
        String newTitle = "";

        assertThrows(IllegalArgumentException.class, () -> BookSuggestionSystem.updateBook(oldTitle, newTitle, books));

    }

    @Test
    public void givenShowBooks_whenInputIsAnArrayListWithBooks_thenDisplayListOfBooks() {

        books = new ArrayList<>(Arrays.asList("Life At Semicolon", "The Client", "Purple Hibiscus", "Blink Of An Eye"));
        BookSuggestionSystem.showBooks(books);

    }
    

}
