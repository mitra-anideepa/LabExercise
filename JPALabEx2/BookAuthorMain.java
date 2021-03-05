package com.abc.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.abc.entity.Author;
import com.abc.entity.Book;

public class BookAuthorMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();

		Author author = new Author();
		author.setId(543);
		author.setName("Haruki Murakami");

		Book book1 = new Book();
		book1.setISBN(243567);
		book1.setTitle("Norwegian Wood");
		book1.setPrice(499);

		Book book2 = new Book();
		book2.setISBN(456823);
		book2.setTitle("Men Without Women");
		book2.setPrice(699);

		Book book3 = new Book();
		book3.setISBN(789644);
		book3.setTitle("Kafka on the Shore");
		book3.setPrice(699);

		Book book4 = new Book();
		book4.setISBN(564333);
		book4.setTitle("Blind Willow, Sleeping Woman");
		book4.setPrice(499);

//		Author author = new Author();
//		author.setId(675);
//		author.setName("Haruki Murakami");

		author.addBook(book1);
		author.addBook(book2);
		author.addBook(book3);
		author.addBook(book4);

//		Set<Book> books = new HashSet<>();
//		books.add(book1);
//		books.add(book2);
//		books.add(book3);
//		books.add(book4);
//		author.setBook(books);

		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		entityManager.persist(author);
		System.out.println("Books Entered");
		txn.commit();

		entityManager.close();
		factory.close();

	}

}