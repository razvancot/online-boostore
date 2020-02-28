package com.razvanproject.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.razvanproject.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
