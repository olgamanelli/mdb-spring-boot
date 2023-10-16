package com.mongodb.mdbspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mongodb.mdbspringboot.item.GroceryItem;
import java.util.*;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {

	//The first method, findItemByName, requires a parameter for the query, 
	//i.e., the field by which to filter the query.
	@Query("{name: '?0'}")
	GroceryItem findItemByName(String name);
	
	//The second method uses the category field to get all the items of a particular category
	// We only want to project the field's name and quantity in the query response, 
	//so we set those fields to 1
	@Query(value="{category: '?0'}", fields = "{'name' : 1, 'quantity' : 1}")
	List<GroceryItem> findAll(String category);
	
	public long count();
}
