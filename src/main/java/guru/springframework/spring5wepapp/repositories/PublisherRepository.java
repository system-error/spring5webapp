package guru.springframework.spring5wepapp.repositories;

import guru.springframework.spring5wepapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
