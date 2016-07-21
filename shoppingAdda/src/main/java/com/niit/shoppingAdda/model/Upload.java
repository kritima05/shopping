package com.niit.shoppingAdda.model;
//

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Table(name="upload")
public class Upload implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Transient
private MultipartFile image;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the image
 */
public MultipartFile getImage() {
	return image;
}
/**
 * @param image the image to set
 */
public void setImage(MultipartFile image) {
	this.image = image;
}
	
	
}