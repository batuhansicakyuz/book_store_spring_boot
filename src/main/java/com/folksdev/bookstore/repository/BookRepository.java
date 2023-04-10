package com.folksdev.bookstore.repository;

import com.folksdev.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//Bu repository uygulamayla veritabanında köprü olucak, JpaRepository sayesinde yapıyoruz.
//JpaRepository'de id ve hangi tablo oldugunu belirtiyoruz

public interface BookRepository extends JpaRepository<Book, Integer> {

}
