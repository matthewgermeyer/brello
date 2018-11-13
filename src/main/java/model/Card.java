/**
 * 
 */
package model;

import javax.persistence.Entity;

/**

 * @author Matt

 *
 */

@Entity
public class Card extends BaseEntity {

private String text;

protected Card() {
	super();
}

/**
 * @return the text
 */
public String getText() {
	return text;
}

/**
 * @param text the text to set
 */
public void setText(String text) {
	this.text = text;
}



}
