/**
 * 
 */
package model;

import javax.persistence.Entity;

import core.BaseEntity;


@Entity
public class List extends BaseEntity {
	
	private String name;
	
	
	//constructors
	protected List() {
		super();
	}
	
	public List(String name) {
		this();
		this.name =name;
	}

	//getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
