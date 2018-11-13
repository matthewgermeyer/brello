/**
 * 
 */
package model;

import javax.persistence.Entity;

import core.BaseEntity;

@Entity
public class Card extends BaseEntity {

private String text;

//constructors
protected Card() {
	super();
}


 //getters & setters
public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}



}
