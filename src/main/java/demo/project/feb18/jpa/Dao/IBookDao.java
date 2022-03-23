package demo.project.feb18.jpa.Dao;


import demo.project.feb18.jpa.entity.Book;

public interface IBookDao {

	Book addBook(Book book);

	Book updateBookPrice(int isbn, double price);
    Book deleteBookById(int isbn);

	Book getBookById(int isbn);
}
