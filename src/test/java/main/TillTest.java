package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.item.Item;
import main.till.Till;

public class TillTest {
	Till till = new Till();
	
	@Test
	public void scanItemsTest() {
		till.scanItems("asdasdsa, apple, apple orange orange ,,, apple");
		assertEquals(4, till.getShopingCart().getListOfItems().size());
		
		till.getShopingCart().getListOfItems().clear();
		till.scanItems("apple");
		assertEquals(Item.APPLE, till.getShopingCart().getListOfItems().get(0));
		
		till.scanItems("orange");
		assertEquals(Item.ORANGE, till.getShopingCart().getListOfItems().get(1));
	}
}
