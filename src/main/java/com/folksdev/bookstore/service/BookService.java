package com.folksdev.bookstore.service;

import com.folksdev.bookstore.model.Book;
import com.folksdev.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

//BookService sayesinde verdiğim id ye ait book objesini veri tabanından getirmek istiyorum
//Spring Boot servisi oldugunu belirtmemiz gerekiyor.
@Service
public class BookService {

    //book repository inject etmemiz gerekiyor ki kullanabilelim
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //id vericez bize book donucek
    public Optional<Book> findBookById(Integer bookId){
        return  bookRepository.findById(bookId);
    }
}
