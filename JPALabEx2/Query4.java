package com.abc.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;

import com.abc.entity.Author;
//import com.abc.entity.Book;

public class Query4 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager entityManager = factory.createEntityManager();

//		TypedQuery<Author> query = entityManager.createQuery(
//				"select a from Author a join a.Book b where b.isbn = 789644", Author.class);
//		query.setParameter(1, "789644");
		@SuppressWarnings("unchecked")
		List<Author> list = (List<Author>) entityManager.createQuery(
				"select a.name from Author a join a.Book b where b.isbn = 789644").getResultList();
		list.stream().forEach(a -> System.out.println(a.getName()));

		entityManager.close();
		factory.close();

	}

}
