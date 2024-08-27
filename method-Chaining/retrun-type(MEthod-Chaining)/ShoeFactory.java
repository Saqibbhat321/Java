class ShoeFactory
{
	public static double order(String brand)
	{
		if(brand == "Puma")
		{
			System.out.println("brand is :"+brand);
			double price =1500;
			System.out.println("price is :"+price);
			return price;
		}
		
		if(brand == "Nike")
		{
			System.out.println("brand is :"+brand);
			double price =2000;
			System.out.println("price is :"+price);
			return price;
		}
		return 999;
		
	}
}