package org.nexus.librarymanagementsystem.book.repository;

import org.nexus.librarymanagementsystem.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
