class Chocolate
{
	String brand;
	double price;
	String flavour;
	String size;
	
	Chocolate(String brand){
		this.brand = brand;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setFlavour(String flavour)
	{
		this.flavour = flavour;
	}
	public void displayDetails()
	{
		System.out.println("Brand is: "+brand);
		System.out.println("price is: "+price);
		System.out.println("flavour is: "+flavour);
		System.out.println("size is: "+this.size);
	}
}