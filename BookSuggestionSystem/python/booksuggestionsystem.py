import random

def display_menu():
    
    print("""
        1. Get Suggestions
        2. Add Book
        3. Remove Book
        4. Update Book
        5. Show All Books
        """)


def get_book_suggestion (books):

    if len(books) == 0: 
        raise ValueError("Your library is empty. please add books")   

    else: 
        for index in range (len(books)): 
            selected_book = random.choice(books)
        
    return selected_book


def is_page_suggestion_within_range():

    random_page_number = random.randint(1, 101)

    if random_page_number > 0 and random_page_number <= 100: 
        return True

    return False


def add_book (new_book, books): 
        
    for book in books: 
        if book.lower() == new_book.lower(): 
            raise ValueError("Book already exists")                

    books.append(new_book)
    return "Book added successfully" 
     

def remove_book (old_book, books): 

    for book in books:
        if book.lower() == old_book.lower(): 
            books.remove(book)
            return "Book removed successfully"        
  
    raise ValueError("Book not found")


def update_book (old_title, new_title, books): 

    for book in books: 
        if book.lower() != old_title.lower(): 
            raise ValueError("Book not found")       
                 
    for book in books: 
        if book.lower() == old_title.lower(): 
            books.remove(book)
            books.append(new_title)    
 
    return "Book updated successfully" 
     

def show_list_of_books(books): 

    for book in books: 
        print(book)
    

