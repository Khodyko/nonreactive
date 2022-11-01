package com.example.nonreactive.repository;

import com.example.nonreactive.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    @Query(value = "SELECT * FROM Book b, pg_sleep(0.2) where b.id=:id ", nativeQuery = true)
    Book findAllBookWithDelayById(Long id);
}
