package com.example.bookTest.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CoffeeDTO {
	private int coffeeId;
	private String itemName;
	private int price;
	private boolean decaffein;
}
