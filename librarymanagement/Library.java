package librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private Address address;
    private List<Book> books;
    private List<Transcation> transcations;
    
    public void  addBook(Book newBook){

    }

    public void issueBook(Book book ,User user){

    }
    public void returnBook(Book book, User user){

    }

    public List<Book> searchBook(String title){
        List<Book> result = new ArrayList<>();
        return result;
    }
    
}
