const {displayMenu, getBookSuggestion, isPageSuggestionWithinRange, addBook, removeBook, updateBook, showListOfBooks} = require('./book-suggestion-system-function')

test("test that display menu functions will return menu when called", () => {

    displayMenu();

})

test("test that when list is empty then throw an error message", () => {

    const books = [];
    expect(() => getBookSuggestion(books)).toThrow("Your library is empty. please add books");

})


test("test that when list is not empty then a book is suggested at random", () => {

    const books = ["The Client", "Gone Girl", "Purple Hibiscus", "Blink Of An Eye"];
    expect(books).toContain(getBookSuggestion(books));

})


test("test that when page selection range is 1 to 100 then return true if randomly seggested page falls within range", () => {

    const result = isPageSuggestionWithinRange();
    expect(result).toBe(true);

})


test("test that when a new book is added then return book added successfully message", () => {

    const books = [];
    let title = "Life At Semicolon"
    let message = "Book added successfully"

    expect(message).toBe(addBook(title, books));

})


test("test that when an already existing book is added then throw an error message", () => {

    const books = ["Life At Semicolon"]
    let title = "Life At Semicolon"

    expect(() => addBook(title, books)).toThrow("Book already exists");

})


test("test that when an already existing book written in uppercase is added then throw an error message", () => {

    const books = ["Life At Semicolon"]
    let title = "LIFE AT SEMICOLON"

    expect(() => addBook(title, books)).toThrow("Book already exists");

})


test("test that when an already existing book written in lowercase is added then throw an error message", () => {

    const books = ["Life At Semicolon"]
    let title = "life at semicolon"

    expect(() => addBook(title, books)).toThrow("Book already exists");

})


test("test that when an old book is removed then return book removed succesfully message", () => {

    const books = ["Life At Semicolon"]
    let title = "Life At Semicolon"
    let message = "Book removed successfully"

    expect(message).toBe(removeBook(title, books));

})


test("test that when an old book written in uppercase is removed then return book removed succesfully message", () => {

    const books = ["Life At Semicolon"]
    let title = "LIFE AT SEMICOLON"
    let message = "Book removed successfully"

    expect(message).toBe(removeBook(title, books));

})


test("test that when an old book written in lowercase is removed then return book removed succesfully message", () => {

    const books = ["Life At Semicolon"]
    let title = "life at semicolon"
    let message = "Book removed successfully"

    expect(message).toBe(removeBook(title, books));

})


test("test that when a book that does not exist is removed then throw an error message", () => {

    const books = ["Life At Semicolon"]
    let title = "lNo Passion For Tech"

    expect(() => removeBook(title, books)).toThrow("Book not found");

})


test("test that when an old book is updated then return book updated message", () => {

    const books = ["Life At Semicolon"]
    let oldTitle = "Life At Semicolon"
    let newTitle = "No Life At Semicolon"
    let message = "Book updated successfully"

    expect(message).toBe(updateBook(oldTitle, newTitle, books));

})


test("test that when old book title does not exist then throw an error message", () => {

    const books = ["Life At Semicolon"]
    let oldTitle = "No Passion For Tech"
    let newTitle = ""

    expect(() => updateBook(oldTitle, newTitle, books)).toThrow("Book not found");

})


test("test that show list of books function will return list of books when called", () => {

     const books = ["Life At Semicolon", "The Client", "Purple Hibiscus", "Blink Of An Eye"]
     showListOfBooks(books);

})


               



