package com.niit.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity

public class Product{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	@NotEmpty(message="Productname cannot be blank")
	
private String productName;
	@Min(value=50)
private double price;
private int quantity;
@NotEmpty(message="product description should not be empty ")
private String description;
@ManyToOne
@JoinColumn(name="cid")
private Category  category;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

}



