package main.till;

import java.util.Arrays;
import java.util.List;

import main.item.Item;
import main.shopingcart.ShopingCart;

public class Till {
	private ShopingCart shopingCart = new ShopingCart();

	public void scanItems(String input) {
		List<String> items = Arrays.asList(input.split(" "));

		for (String itemAsString : items) {
			Item item = null;
			try {
				item = Item.valueOf(itemAsString.toUpperCase().trim());
			} catch (Exception e) {
				System.out.println("Item not found: " + item);
			}
			if(item != null) {
				shopingCart.getListOfItems().add((item));
			}
		}

		shopingCart.checkout();
	}
	
	public ShopingCart getShopingCart() {
		return shopingCart;
	}
}
