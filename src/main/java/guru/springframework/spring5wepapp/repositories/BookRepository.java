package guru.springframework.spring5wepapp.repositories;

import guru.springframework.spring5wepapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
