package demo.project.feb18.jpa;

import demo.project.feb18.jpa.Dao.AuthorBookDao;
import demo.project.feb18.jpa.Dao.AuthorDao;
import demo.project.feb18.jpa.Dao.BookDao;
import demo.project.feb18.jpa.entity.Author;
import demo.project.feb18.jpa.entity.AuthorBookTable;
import demo.project.feb18.jpa.entity.Book;

public class JpaDemo {
    
	public static void main(String[] args) {
		System.out.println("Start");

		//AuthorDao dao = new AuthorDao();
	Author author = new Author(103,"Monika","kumari","Choubey",5428793423l);
     //dao.addAuthor(author);
		
		//System.out.println(dao.getAuthorById(101));
		//dao.updateAuthorFirstName(101, "Tonu");

       // dao.deleteAuthorById(105);
		//BookDao bdo=new BookDao();
		Book book=new Book(253,"Freedom Fighters",450.25);
		//bdo.addBook(book);
		//System.out.println(bdo.getBookById(251));
	AuthorBookDao abd=new AuthorBookDao();
	AuthorBookTable abt=new AuthorBookTable(book.getIsbn(),author.getId());
	//abd.addAuthorBook(abt);	
	System.out.println(abd.getAuthorDetails(abt));
			System.out.println("End");
	}
}
