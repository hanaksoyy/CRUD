package com.Han.Crud.service;

import com.Han.Crud.Repository.BookRepository;
import org.springframework.stereotype.Service;
import com.Han.Crud.models.Book;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book book) {
        return bookRepository.findById(id)
                .map(existingBook -> bookRepository.save(book))
                .orElse(null);
    }
}
