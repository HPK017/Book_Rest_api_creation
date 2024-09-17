package com.api.book.bootrestbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook.Entity.Book;

public interface bookrepo extends CrudRepository<Book, Integer> {
    
    public Book findById(int id);
}
