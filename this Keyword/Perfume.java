class Perfume
{
	String brand;
	double cost;
	double price;
	int quantity;
	
	Perfume()
	{
		System.out.println("no parameter constructor");
	}
	Perfume(String brand, double price)
	{
		this.brand = brand;
		this.price = price;
		System.out.println("String, double constructor");
	}
	Perfume(String brand, double price, int quantity)
	{
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		System.out.println("String, double double constructor");
		
	}
	Perfume(String brand, double price,int quantity, double cost)
	{
		this.cost = cost;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		System.out.println("string, double, int and double constructor");
	
	}
}