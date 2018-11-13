package repository;

import org.springframework.data.repository.CrudRepository;

import model.Card;

public interface CardRepository extends CrudRepository<Card, Long >{

	
}
