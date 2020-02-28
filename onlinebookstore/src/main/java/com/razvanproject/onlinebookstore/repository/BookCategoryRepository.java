package com.razvanproject.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.razvanproject.onlinebookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
