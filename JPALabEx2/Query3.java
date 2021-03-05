package com.abc.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.abc.entity.Book;

public class Query3 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();

		TypedQuery<Book> query = entityManager.createQuery("Select b from Book b where b.price between 500 and 1000",
				Book.class);
		List<Book> list = query.getResultList();
		list.stream().forEach(b -> System.out.println(b.getTitle()));

		entityManager.close();
		factory.close();

	}

}
