package guru.springframework.spring5wepapp.repositories;

import guru.springframework.spring5wepapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
