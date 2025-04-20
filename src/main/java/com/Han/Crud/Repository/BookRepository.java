package com.Han.Crud.Repository;
import com.Han.Crud.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
