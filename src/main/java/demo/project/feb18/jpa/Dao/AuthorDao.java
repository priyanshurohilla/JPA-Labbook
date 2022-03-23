package demo.project.feb18.jpa.Dao;

import javax.persistence.EntityManager;

import demo.project.feb18.jpa.entity.Author;

public class AuthorDao 
	implements IAuthorDao{
		private EntityManager entityManager;

		public AuthorDao() {
			entityManager = JpaUtil.getEntityManager();
		}

		@Override
		public Author addAuthor(Author author) {
			entityManager.getTransaction().begin();
			entityManager.persist(author);
			entityManager.getTransaction().commit();
			return author;
		}

		@Override
		public Author updateAuthorFirstName(int id,String name) {
			entityManager.getTransaction().begin();
			Author aut = entityManager.find(Author.class, id);
			aut.setFirstName(name);
			 entityManager.merge(aut);
			entityManager.getTransaction().commit();
			return entityManager.find(Author.class, id);
		}
		@Override
		public Author updateAuthorMiddleName(int id,String name) {
			entityManager.getTransaction().begin();
			Author aut = entityManager.find(Author.class, id);
			aut.setMiddleName(name);
			 entityManager.merge(aut);
			entityManager.getTransaction().commit();
			return entityManager.find(Author.class, id);
		}
		@Override
		public Author updateAuthorLastName(int id,String name) {
			entityManager.getTransaction().begin();
			Author aut = entityManager.find(Author.class, id);
			aut.setLastName(name);
			 entityManager.merge(aut);
			entityManager.getTransaction().commit();
			return entityManager.find(Author.class, id);
		}
		@Override
		public Author updateAuthorPhone(int id,long phone) {
			entityManager.getTransaction().begin();
			Author aut = entityManager.find(Author.class, id);
			aut.setPhoneNo(phone);
			 entityManager.merge(aut);
			entityManager.getTransaction().commit();
			return entityManager.find(Author.class, id);
		}

		@Override
		public Author deleteAuthorById(int id) {
			entityManager.getTransaction().begin();
			Author aut = entityManager.find(Author.class, id);
			entityManager.remove(aut);
			entityManager.getTransaction().commit();
			return aut;
		}

		@Override
		public Author getAuthorById(int id) {
			entityManager.getTransaction().begin();
			Author aut = entityManager.find(Author.class, id);
			entityManager.getTransaction().commit();
			return aut;

		}
}
