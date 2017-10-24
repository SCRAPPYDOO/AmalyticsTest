package main.item;

public enum Item {
	APPLE(25, DiscountType.NO_DISCOUNT),
	ORANGE(30, DiscountType.NO_DISCOUNT),
	GARLIC(15, DiscountType.NO_DISCOUNT),
	PAPAYAS(50, DiscountType.THREE_FOR_TWO);
	
	private double price;
	private DiscountType discountType;
	
	Item(double price, DiscountType discountType) {
		this.price = price;
		this.discountType = discountType;
	}
	
	public double getPrice() {
		return price;
	}

	public DiscountType getDiscountType() {
		return discountType;
	}
}
