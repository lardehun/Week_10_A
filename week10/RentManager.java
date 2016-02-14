package week10;

import java.util.ArrayList;
import java.util.List;


public class RentManager {
	public static void main(String[] args) {
		
		Person jani = new Person("Sajt","János",Gender.MALE,1000);
		Person geri = new Person("Sajt","Gergö",Gender.MALE,1100);
		Person barbi = new Person("Sajt","Barbara",Gender.FEMALE,900);
		
		List<Person> gameStaff1 = new ArrayList<Person>();
		gameStaff1.add(geri);
		gameStaff1.add(jani);
		
		List<Person> gameStaff2 = new ArrayList<Person>();
		gameStaff2.add(geri);
		gameStaff2.add(barbi);
		
		Product game1 = new Game(true,gameStaff1,100);
		Product game2 = new Game(false,gameStaff2,200);
		
		System.out.println(game1.getInvestment());
		System.out.println(game2.getInvestment());
		System.out.println(IdGenerator.generate(game1));
		System.out.println(IdGenerator.generate(game2));
		
		
		
		
		Person moviePerson1 = new Person("Haragosi","János",Gender.MALE,3000);
		Person moviePerson2 = new Person("Haragosi","Gergö",Gender.MALE,3100);
		Person moviePerson3 = new Person("Haragosi","Barbara",Gender.FEMALE,2900);
		
		List<Person> movieCast1 = new ArrayList<Person>();
		movieCast1.add(moviePerson1);
		movieCast1.add(moviePerson2);
		
		List<Person> movieCast2 = new ArrayList<Person>();
		movieCast2.add(moviePerson2);
		movieCast2.add(moviePerson3);
		
		Product movie1 = new Movie(Genre.ACTION,120,99,movieCast1,3000);
		Product movie2 = new Movie(Genre.ACTION,120,99,movieCast2,3000);
		
		System.out.println(movie1.getInvestment());
		System.out.println(movie2.getInvestment());
		System.out.println(IdGenerator.generate(movie1));
		System.out.println(IdGenerator.generate(movie2));
		
		
		
		
		Person bookPerson1 = new Person("Haragosi","Attila",Gender.MALE,10000);
		Person bookPerson2 = new Person("Haragosi","Péter",Gender.MALE,30100);
		
		Product book1 = new Book(bookPerson1);
		Product book2 = new Book(bookPerson2);
		
		System.out.println(book1.getInvestment());
		System.out.println(book2.getInvestment());
		System.out.println(IdGenerator.generate(book1));
		System.out.println(IdGenerator.generate(book2));
		
		
		
		List<Buyable> sumPriceDemo = new ArrayList<Buyable>();
		sumPriceDemo.add((Buyable) movie1);
		sumPriceDemo.add((Buyable) game1);
		
		System.out.println(sumPrice(sumPriceDemo));
	
	}
	
	public static int sumPrice(List<Buyable> list) {
		int total = 0;
		for (Buyable buyable : list) {
			total += buyable.getPrice();
		}
		return total;
	}
}
