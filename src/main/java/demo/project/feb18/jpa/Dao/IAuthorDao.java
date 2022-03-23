package demo.project.feb18.jpa.Dao;

import demo.project.feb18.jpa.entity.Author;

public interface IAuthorDao {
	public abstract Author addAuthor(Author aut);

	public abstract Author updateAuthorFirstName(int id,String name);

	public abstract Author deleteAuthorById(int id);

	public abstract Author getAuthorById(int id);

	Author updateAuthorPhone(int id, long ph);

	Author updateAuthorLastName(int id, String name);

	Author updateAuthorMiddleName(int id, String name);

}
