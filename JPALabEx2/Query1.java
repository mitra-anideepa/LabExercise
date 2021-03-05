package com.abc.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.abc.entity.Book;

public class Query1 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();

		String jpql = "Select b from Book b";

		TypedQuery<Book> query = entityManager.createQuery(jpql, Book.class);
		List<Book> list = query.getResultList();
		list.stream().forEach(b -> System.out.println(b.getTitle()));

		entityManager.close();
		factory.close();

	}

}
