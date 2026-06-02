/*
ADVANCED 1 – E-Commerce Order System

Create a class Order:

Attributes:
orderId
customerName
productName
quantity
pricePerItem (PRIVATE)
Requirements:
Initialize using constructor
Use encapsulation properly
Methods:
calculateTotal()
applyDiscount()
Rules:
If total > 5000 → 10% discount
If total > 10000 → 20% discount
Twist:

Final amount must be returned, not printed directly inside constructor.
*/
class Order{
	int orderId;
	String customerName;
	String productName;
	int quantity;
	private double pricePerItem;
	
	void setPricePerItem(double price)
	{
		this.pricePerItem=price;
	}
	
	public double getPricePerItem()
	{
		return pricePerItem;
	}
	
	Order(int orderId,String customerName,String productName,int quantity)
	{
		this.orderId=orderId;
		this.customerName=customerName;
		this.productName=productName;
		this.quantity=quantity;
	}
	
	double calculateTotal()
	{
		return pricePerItem*quantity;
	}
	
	double applyDiscount(double total)
	{
		double price;
		if(total>=10000)
		{
			price = total - (total*0.2);
			return price;
		}
		else if(total>=5000)
		{
			price = total - (total*0.1);
			return price;
		}
		else
		{
			return total;
		}
	}
	
	void display(double price)
	{
		System.out.println("-----------------------------");
		System.out.println("Order ID: "+orderId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Product Name: "+productName);
		System.out.println("Quantity: "+quantity);
		System.out.println("Final amount: Rs."+price);
		
	}
}
public class Commerce_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order item1 = new Order(690,"Stwatra","Chocolate",2);
		item1.setPricePerItem(100);
		double total = item1.calculateTotal();
		double price = item1.applyDiscount(total);
		System.out.println("GROCERY LIST:");
		item1.display(price);
	}

}
