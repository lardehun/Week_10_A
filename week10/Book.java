package week10;

public class Book extends Product{
	Person author;
	

	public Book(Person author) {
		this.author = author;
	}

	
	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}


	@Override
	public long getInvestment() {
		int investment = 0;
		investment += author.getSalary();
		return investment;
	}
	
}
