const assert = require('node:assert/strict');

function displayMenu() {
    
    console.log(`
        1. Get Suggestions
        2. Add Book
        3. Remove Book
        4. Update Book
        5. Show All Books
        `);

}


function getBookSuggestion (books) {
    
    let selectedBook = "";

    if(books.length === 0) {
        throw new Error("Your library is empty. please add books");
    }

    else {
        for(let index = 0; index < books.length; index++) {
            selectedBook = books[Math.floor(Math.random() * books.length)];
        }
    }

    return selectedBook;
}


function isPageSuggestionWithinRange () {

    let randomPageNumber = Math.floor(Math.random() * 100) + 1;

    if(randomPageNumber > 0 && randomPageNumber <= 100) return true;

    return false;

}


function addBook (newBook, books) {
        
    for(const book of books) {
        if(book.toLowerCase() === newBook.toLowerCase()) {
            throw new Error("Book already exists");
        }
    }             

    books.push(newBook);
    return "Book added successfully"; 
     
}


function removeBook (oldBook, books) {

    for(const book of books) {
        if(book.toLowerCase() === oldBook.toLowerCase()) {
            books.pop(oldBook);
            return "Book removed successfully";      
        }
    }
  
    throw new Error("Book not found");

}


function updateBook (oldTitle, newTitle, books) {

    for(const book of books) {
        if(book.toLowerCase() != oldTitle.toLowerCase()) {
            throw new Error("Book not found");
        }
    }             
    for(const book of books) {
        if(book.toLowerCase() === oldTitle.toLowerCase()) {
            books.pop(book);
            books.push(newTitle);
        }
    } 
 
    return "Book updated successfully"; 
     
}


function showBooks(books) {

    for (const book of books) {
        console.log(book);
    }

}

module.exports = {displayMenu}

