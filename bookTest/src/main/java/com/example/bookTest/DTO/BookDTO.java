package com.example.bookTest.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;
	private int bookPage;
	private String publisher;
}
