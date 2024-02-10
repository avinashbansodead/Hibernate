package My_Demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	
		@Id
		private int bookId;
		private String bookName;
		private int bookNop;

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public int getBookNop() {
			return bookNop;
		}

		public void setBookNop(int bookNop) {
			this.bookNop = bookNop;
		}

		public List<Author> getAuthors() {
			return authors;
		}

		public void setAuthors(List<Author> authors) {
			this.authors = authors;
		}

		@OneToMany
		List<Author>authors;
		
		
		
	}