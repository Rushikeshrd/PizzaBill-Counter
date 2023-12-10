package PackPizza;

public class Pizza {
	private int price;
	private Boolean veg;
	
	private int basePizzaPrice;
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int packing = 20;
	
	private Boolean isExtraCheeseAdded = false;
	private Boolean isExtraToppingsAdded = false;
	private Boolean isOptedForTakeAway = false;
	
	
	public Pizza(Boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingsAdded = true;
		this.price += extraToppingsPrice;
	}
	
	public void takeAway() {	
		isOptedForTakeAway = true;
		this.price += packing;
	}
	
	public void getBill() {
		String bill = "";
		System.out.println("Base Pizza Price: Rs." + basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill += "Extra Cheese Charges: Rs." + extraCheesePrice + "\n";
		}
		if(isExtraToppingsAdded) {
			bill += "Extra Toppings Charges: Rs." + extraToppingsPrice + "\n";
		}
		if(isOptedForTakeAway) {
			bill += "Take away Charges: Rs." + packing + "\n";
		}
		
		bill += "Total Bill: Rs." + this.price + "\n";
		System.out.println(bill);
	}
}
