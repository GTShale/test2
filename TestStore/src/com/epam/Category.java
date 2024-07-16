package com.epam.data;

import com.epam.controller.Language;

import lombok.Data;

@Data
public class Category {
	private long id;
	private String name;
	private String discription;
	
	public long getLanguageId(Language language) {
		return language.getId();
	}
}
