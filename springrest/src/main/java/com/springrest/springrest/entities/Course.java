package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
@Id
private long id;
private String title;
private String descriptionString;
public Course() {}
public Course(long id, String title, String descriptionString) {
	super();
	this.id = id;
	this.title = title;
	this.descriptionString = descriptionString;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescriptionString() {
	return descriptionString;
}
public void setDescriptionString(String descriptionString) {
	this.descriptionString = descriptionString;
}
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", descriptionString=" + descriptionString + "]";
}

}
