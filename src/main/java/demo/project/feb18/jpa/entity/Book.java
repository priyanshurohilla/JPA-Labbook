package demo.project.feb18.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Book {
@Id
int isbn;
String title;
double price;
Book()
{
}
public Book(int isbn, String title, double price) {
	super();
	this.isbn = isbn;
	this.title = title;
	this.price = price;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
}


}
