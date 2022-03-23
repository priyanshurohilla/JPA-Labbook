package demo.project.feb18.jpa.Dao;

import javax.persistence.EntityManager;

import demo.project.feb18.jpa.entity.Author;
import demo.project.feb18.jpa.entity.Book;

public class BookDao implements IBookDao{
	private EntityManager entityManager;
	public BookDao() {
		entityManager = JpaUtil.getEntityManager();
	}
	@Override
	public Book addBook(Book book) {
		entityManager.getTransaction().begin();
		entityManager.persist(book);
		entityManager.getTransaction().commit();
		return book;
	}
	@Override
	public Book updateBookPrice(int isbn,double price) {
		entityManager.getTransaction().begin();
		Book book= entityManager.find(Book.class, isbn);
		book.setPrice(price);
		 entityManager.merge(book);
		entityManager.getTransaction().commit();
		return entityManager.find(Book.class, isbn);
	}
	@Override
	public Book deleteBookById(int isbn) {
		entityManager.getTransaction().begin();
		Book book = entityManager.find(Book.class, isbn);
		entityManager.remove(book);
		entityManager.getTransaction().commit();
		return book;
	}
	@Override
	public Book getBookById(int isbn) {
		entityManager.getTransaction().begin();
		Book book = entityManager.find(Book.class, isbn);
		entityManager.getTransaction().commit();
		return book;

	}
}
