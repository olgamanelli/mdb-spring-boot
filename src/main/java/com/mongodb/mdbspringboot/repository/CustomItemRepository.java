package com.mongodb.mdbspringboot.repository;

public interface CustomItemRepository {

	void updateItemQuantity(String itemName, float newQuantity);
}
