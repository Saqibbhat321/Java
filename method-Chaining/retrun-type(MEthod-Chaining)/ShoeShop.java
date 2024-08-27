class ShoeShop
{
	public static double purchase(String brand)
	{
		double ref = ShoeFactory.order(brand);
		return ref;
	}
}