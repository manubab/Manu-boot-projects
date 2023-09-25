package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
