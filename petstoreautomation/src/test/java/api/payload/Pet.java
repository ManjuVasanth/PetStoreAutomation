package api.payload;

import java.util.List;

import javax.swing.text.html.HTML.Tag;

import lombok.Data;
@Data
public class Pet {
 int id ;
 String name;
 int categoryId;
 String categoryName;
 String photoUrls;
 String tags;
 String status;
 /*
 public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getPhotoUrls() {
	return photoUrls;
}
public void setPhotoUrls(String photoUrls) {
	this.photoUrls = photoUrls;
}
public String getTags() {
	return tags;
}
public String setTags(String tags) {
	return this.tags = tags;
}

 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getStatus() {
	return status;
}
public String setStatus(String status) {
	return this.status = status;
}*/
}
