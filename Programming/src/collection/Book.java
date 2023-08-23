package collection;

import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.event.ObjectChangeListener;

public class Book {

	String name;
	int id;
	double price;

	Book(){}
	Book(String name, int id, double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	public void display() {
		System.out.println("Details of book");
		System.out.println("Book Name :"+name);
		System.out.println("Book ID :"+id);
		System.out.println("Book Price :"+price);
		System.out.println("**@#$%@#$%**");
	}

}


class Library{
	ArrayList al=new ArrayList();



	public void toAdd(Book b) {
		al.add(b);
	}
	//to remove book objects based on name
	public  void toRemove(double price) {
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			Book b=(Book) o;
			if(b.price==price) {
				System.out.println(b);
				i.remove();
			}
		}
	}
	//to remove book objects based on id
	public  void toRemove(int id) {
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			Book b=(Book) o;
			if(b.id==id) {
				System.out.println(b);
				i.remove();
			}
		}
	}

	//to remove book objects based on name
	public  void toRemove(String name) {
		Iterator i = al.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			Book b=(Book) o;
			if(b.name.equals(name)) {
				System.out.println(b);
				i.remove();
			}
		}
	}
}
class LibDriver1{
	public static void main(String[] args) {
		Library l=new Library();
		l.toAdd(new Book("MANUAL",1,300.0));
		l.toAdd(new Book("SQL",2,100.0));
		l.toAdd(new Book("Java",3,500.0));
		l.toAdd(new Book("SELENIUM",4,200.0));
		for(Object o : l.al) {
			System.out.println(o);
		}

		l.toRemove(300.0);
		l.toRemove(2);
	}
}

