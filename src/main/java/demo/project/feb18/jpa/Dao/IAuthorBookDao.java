package demo.project.feb18.jpa.Dao;

import demo.project.feb18.jpa.entity.Author;
import demo.project.feb18.jpa.entity.AuthorBookTable;
import demo.project.feb18.jpa.entity.Book;

public interface IAuthorBookDao {

	Author getAuthorDetails(AuthorBookTable abt);

	Book getBookDetails(AuthorBookTable abt);

	AuthorBookTable addAuthorBook(AuthorBookTable abt);

	AuthorBookTable deleteAuthorBookByBookId(int id);

}
