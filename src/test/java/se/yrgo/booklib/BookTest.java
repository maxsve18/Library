package se.yrgo.booklib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "Learning Java", "", "", "", 0);
		Book book2 = new Book(1, "Learning Java", "", "", "", 0);
		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "Learning Java", "", "", "", 0);
		Book book2 = new Book(2, "Neuromancer", "William Gibson", "978 1 399 60777 3", "Gollancz", 297);
		assertNotEquals(book1, book2);
	}

}
