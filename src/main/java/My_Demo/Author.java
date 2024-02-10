package My_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Author {
	@Id
	private int authorId;
	private String authorName;
	private int award;
@ManyToOne
private Book books;


	public Book getBooks() {
	return books;
}


public void setBooks(Book books) {
	this.books = books;
}


	public int getAuthorId() {
		return authorId;
	}


	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public int getAward() {
		return award;
	}


	public void setAward(int award) {
		this.award = award;
	}


	


	
}
