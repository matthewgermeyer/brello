/**
 * 
 */
package model;

import javax.persistence.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author Matt

 *
 */
@Entity
public class List extends BaseEntity {
	
	private String name;
	
	protected List() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
}
