import java.util.*;
import java.io.*;

class Author{
	private String name;
	private String email;
	private char gender;

	Author(){
	}

	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	String getName(){
		return name;
	}

	String getEmail(){
		return email;
	}

	char getGender(){
		return gender;
	}

	void setName(String name){
		this.name = name;
	}

	void setEmail(String email){
		this.email = email;
	}

	void setGender(char gender){
		this.gender = gender;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;

	Book(){
	}

	Book(String name, Author author, double price){
		this.name= name;
		this.author = author;
		this.price = price;
	}

	Book(String name, Author author, double price, int qty){
		this.name= name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	String getName(){
		return name;
	}

	void setName(String name){
		this.name = name;
	}

	Author getAuthor(){
		return author;
	}

	double getPrice(){
		return price;
	}

	void setPrice(double price){
		this.price = price;
	}

	int getQty(){
		return qty;
	}

	void setQty(int qty){
		this.qty = qty;
	}

	public String toString(){
		return "BOOK[name = " + name + ", Author[ Name = " + author.getName() + ", email = " + author.getEmail() + ", gender = " + author.getGender() + "], price = " + price + ", qty = " + qty; 
	}
}

class Q1{
	public static void main(String []args){
		Author a1 = new Author("Khushal","KR@gmail.com",'M');
		Book b1 = new Book("Atomic habit",a1,500,2);
		System.out.println(b1);

		Book b2 = new Book("Bhagvat Gita",a1,750,2);
		System.out.println(b2);
	}
}