package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.Id;

@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	protected BaseEntity() {
		id = null;
	}
	
	public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}


}
