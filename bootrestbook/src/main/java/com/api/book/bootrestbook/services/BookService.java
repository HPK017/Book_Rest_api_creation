package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.dialect.MySQL8Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestbook.Entity.Book;
import com.api.book.bootrestbook.dao.bookrepo;

@Component
public class BookService {

    
    @Autowired
    private bookrepo bookrepo;
    // private static List<Book> list = new ArrayList<>();

    // static {
    // list.add(new Book(12, "Java Complete Reference", "XYZ"));
    // list.add(new Book(13, "Java Head Reference", "ABC"));
    // list.add(new Book(14, "Java Things Reference", "LMN"));
    // }

    // get all books
    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) this.bookrepo.findAll();
        return list;
    }

    // get single book by id
    public Book getBookById(int id) {

        Book book = null;
        try {
            // book = list.stream().filter(e -> e.getId() == id).findFirst().get();
            book = this.bookrepo.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    // adding the book
    public Book addBook(Book b) {
        // list.add(b);
       Book result= bookrepo.save(b);
        return result;
    }

    // delete the book
    public void deleteBook(int bid) {
       // list = list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
       bookrepo.deleteById(bid);
    }

    // update the book
    public void updateBook(Book book, int bookId) {
        // list.stream().map(b -> {
        //     if (b.getId() == bookId) {
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
        book.setId(bookId);
        bookrepo.save(book);
    }
}
