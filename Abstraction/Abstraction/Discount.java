package Abstraction;

class AppleDiscount implements DiscountRate{
	
	public double rateofdiscount() {
		return 0.8d;
	}

}

// discount for banana
class BananaDiscount implements DiscountRate{

	public double rateofdiscount() {
		return 0.9d;
	}
}

//discount for orange
class OrangeDiscount implements DiscountRate{
	
	public double rateofdiscount() {
		return 0.7d;
	}
}
