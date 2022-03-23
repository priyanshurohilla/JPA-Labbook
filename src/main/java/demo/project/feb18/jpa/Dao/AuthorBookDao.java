package demo.project.feb18.jpa.Dao;

import javax.persistence.EntityManager;

import demo.project.feb18.jpa.entity.Author;
import demo.project.feb18.jpa.entity.AuthorBookTable;
import demo.project.feb18.jpa.entity.Book;

public class AuthorBookDao implements IAuthorBookDao {
	private EntityManager entityManager;
	public AuthorBookDao() {
		entityManager = JpaUtil.getEntityManager();
	}
	@Override
	public Author getAuthorDetails(AuthorBookTable abt) {
		entityManager.getTransaction().begin();
		Author auth=entityManager.find(Author.class,abt.getAuthorid());
		entityManager.getTransaction().commit();
		return auth;
	}
	@Override
	public Book getBookDetails(AuthorBookTable abt) {
		entityManager.getTransaction().begin();
		Book book=entityManager.find(Book.class,abt.getBookid());
		entityManager.getTransaction().commit();
		return book;
	}
	@Override
	public AuthorBookTable addAuthorBook(AuthorBookTable abt) {
		entityManager.getTransaction().begin();
		entityManager.persist(abt);
		entityManager.getTransaction().commit();
		return abt;
	}
	@Override
	public AuthorBookTable deleteAuthorBookByBookId(int id) {
		entityManager.getTransaction().begin();
		AuthorBookTable aut = entityManager.find(AuthorBookTable.class, id);
		entityManager.remove(aut);
		entityManager.getTransaction().commit();
		return aut;
	}


}
