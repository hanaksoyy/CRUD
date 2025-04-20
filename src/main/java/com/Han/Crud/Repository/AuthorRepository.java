package com.Han.Crud.Repository;

import com.Han.Crud.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository  extends JpaRepository<Author, Long> {
}
