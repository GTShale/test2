package com.epam.controller;

import lombok.Data;

@Data
public class Status {
	private long id;
	private String title;
	
	public long getLanguageId(Language language) {
		return language.getId();
	}

	
}
