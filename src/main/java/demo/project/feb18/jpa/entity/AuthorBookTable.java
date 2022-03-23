package demo.project.feb18.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="author_book_table")
public class AuthorBookTable {
	@Id
	int bookid;
    int authorid;
	public AuthorBookTable(int bookid, int authorid) {
		super();
		this.bookid = bookid;
		this.authorid = authorid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
	@Override
	public String toString() {
		return "AuthorBookTable [bookid=" + bookid + ", authorid=" + authorid + "]";
	}
    

}
