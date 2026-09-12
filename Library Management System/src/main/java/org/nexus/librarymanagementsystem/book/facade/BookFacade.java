package org.nexus.librarymanagementsystem.book.facade;


import org.nexus.librarymanagementsystem.book.dto.BookRequest;
import org.nexus.librarymanagementsystem.book.dto.BookResponse;
import org.nexus.librarymanagementsystem.book.mapper.BookMapper;
import org.nexus.librarymanagementsystem.book.model.Book;
import org.nexus.librarymanagementsystem.book.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookFacade {
    private final BookService bookService;
    private final BookMapper bookMapper;

    public BookFacade(BookService bookService, BookMapper bookMapper){
        this.bookService = bookService;
        this.bookMapper = bookMapper;
    }

    public BookResponse save(BookRequest bookRequest){
        Book book = bookMapper.toEntity(bookRequest);
        Book savedBook = bookMapper.toResponse(book);

        return savedBook;
    }
}
