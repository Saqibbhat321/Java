class Cable
{
	String type = "plastic";
	double price;
	String color;
	int quantity;
	
	
	Cable(String colorLocal,int quantityLocal)
	{
		color = colorLocal;
		quantity = quantityLocal;
		System.out.println("Cable constructor called");
	}
}