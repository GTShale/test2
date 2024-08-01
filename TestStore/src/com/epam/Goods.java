package com.epam.data;

import lombok.Data;

@Data
public class Goods {
	private long id;
	private String name;
	private String discription;
	private int count;
	private int price;
	private long categoryId;
	private boolean isDeleted; //test
}
