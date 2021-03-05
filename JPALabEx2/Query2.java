package com.abc.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.abc.entity.Book;

public class Query2 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();

		TypedQuery<Book> query = entityManager.createQuery("select b from Book b join b.Author a where a.name = ?1",
				Book.class);
		query.setParameter(1, "Haruki Murakami");
		List<Book> list = query.getResultList();
		list.stream().forEach(b -> System.out.println(b.getTitle()));

		entityManager.close();
		factory.close();
	}

}
