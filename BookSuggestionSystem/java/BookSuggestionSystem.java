import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BookSuggestionSystem {

    public static void displayMenu() {
    
       System.out.println("""
            1. Get Suggestions
            2. Add Book
            3. Remove Book
            4. Update Book
            5. Show All Books
            """);

    }


    public static String getBookSuggestion (ArrayList <String> books, Random bookSuggestion) {
    
        int randomIndex = 0;
        String selectedBook = "";

        if(books.size() == 0) {
            throw new IllegalArgumentException("Your library is empty. please add books");
        }

        else {
            for(int index = 0; index < books.size(); index++) {
                randomIndex = bookSuggestion.nextInt(books.size());
            }

            selectedBook = books.get(randomIndex);
        }

        return selectedBook;
    }


    public static boolean isPageSuggestionWithinRange (Random pageSuggestion) {

        int randomPageNumber = pageSuggestion.nextInt(1, 101);

        if(randomPageNumber > 0 && randomPageNumber <= 100) return true;

        return false;

    }


    public static String addBook (String newBook, ArrayList <String> books) {
        
        for(String book : books) {
            if(book.equalsIgnoreCase(newBook)) {
                throw new IllegalArgumentException("Book already exists");
            }
        }             

        books.add(newBook);
        return "Book added successfully"; 
     
    }


    public static String removeBook (String oldBook, ArrayList <String> books) {

        for(String book : books) {
            if(book.equalsIgnoreCase(oldBook)) {
                books.remove(oldBook);
                return "Book removed successfully";      
            }
        }
  
        throw new IllegalArgumentException("Book not found");

    }


    public static String updateBook (String oldTitle, String newTitle, ArrayList <String> books) {

        for(String book : books) {
            if(!book.equalsIgnoreCase(oldTitle)) {
                throw new IllegalArgumentException("Book not found");
            }
        }             
        for(String book : books) {
            if(book.equalsIgnoreCase(oldTitle)) {
                books.remove(book);
                books.add(newTitle);
            }
        } 
 
        return "Book updated successfully"; 
     
    }


    public static void showListOfBooks(ArrayList <String> books) {

        for (String book : books) {
            System.out.println(book);
        }

    }
    

}
