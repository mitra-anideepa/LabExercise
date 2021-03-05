package com.abc.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Author_tbl")
public class Author {

	@Id
//	@Column(name = "author_id")
	private int Id;

//	@Column(name = "author_name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Book> book = new HashSet<>();

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	public void addBook(Book book) {
		this.getBook().add(book);
	}

}
