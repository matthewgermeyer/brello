package repository;

import org.springframework.data.repository.CrudRepository;

import model.List;

public interface ListRepository extends CrudRepository<List, Long> {

}
