package com.mongodb.mdbspringboot.item;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("groceryitems")
public class GroceryItem {
	
	//if we don't pud the @Id annotation Mongo
	//will automatically gnerate and _id when creating the document
	@Id 
	private String id;
	
	private String name;
	private int quantity;
	private String category;
	
	public GroceryItem(String id, String name, int quantity, String category) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.category = category;
	}
}
