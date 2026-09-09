package org.nexus.librarymanagementsystem.book.service;


import org.nexus.librarymanagementsystem.book.exception.BookNotFoundException;
import org.nexus.librarymanagementsystem.book.model.Book;
import org.nexus.librarymanagementsystem.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }

    public Book findById(Long id){
        return bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException("Book not found with id: "+id));
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public void deleteById(Long id){
        if(!bookRepository.existsById(id)){
            throw new BookNotFoundException("Book not found with id: "+id);
        }

        bookRepository.deleteById(id);
    }
}
