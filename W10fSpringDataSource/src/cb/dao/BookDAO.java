package cb.dao;

import cb.beans.Book;

import java.util.ArrayList;

public interface BookDAO {
	
		public int addBook(Book book);
		public ArrayList<Book> getBooks();
}
