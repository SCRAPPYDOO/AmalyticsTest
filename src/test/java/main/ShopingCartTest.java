package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.item.Item;
import main.shopingcart.ShopingCart;

public class ShopingCartTest {
	
	ShopingCart shopingCart = new ShopingCart();
	
	private final String[] listOfItems = {"Apple","Orange", "Orange","Orange","Orange","Apple"};
	
	@Test
	public void checkoutTest() {
		
		shopingCart.setListOfItems(listOfItems);
		
		final double applePrice = Item.APPLE.getPrice();
		final double orangePrice = Item.ORANGE.getPrice();
		final double papayasPrice = Item.PAPAYAS.getPrice();
		final double garlicPrice = Item.GARLIC.getPrice();
		
		double expectedPrice = 2*applePrice + 4*orangePrice;
		double expectedDiscount = 0.0;
		assertEquals(expectedPrice - expectedDiscount, shopingCart.checkout(), 0);
		
		
		shopingCart.setListOfItems("Papayas", "Apple","Apple","Apple","Apple", "Papayas", "Papayas", "Papayas");
		
		expectedPrice = 4*applePrice + 4*papayasPrice;
		expectedDiscount = 1*papayasPrice;
		assertEquals(expectedPrice - expectedDiscount, shopingCart.checkout(), 0);
		
		shopingCart.setListOfItems("Orange","Orange","Orange","Orange");
		
		expectedPrice = 4*orangePrice;
		expectedDiscount = 0.0;
		assertEquals(expectedPrice - expectedDiscount,shopingCart.checkout(), 0);
		
		shopingCart.setListOfItems("apple", "garlic", "garlic", "garlic", "apple", "orange", "orange", "orange", "orange", "orange", "orange", "orange");
		
		expectedPrice = 2*applePrice + 7*orangePrice + 3*garlicPrice;
		expectedDiscount = 0.0;
		assertEquals(expectedPrice - expectedDiscount,shopingCart.checkout(), 0);
	}
}
