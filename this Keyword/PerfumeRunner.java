class PerfumeRunner
{
	public static void main(String[] args)
	{
		Perfume per = new Perfume();
		System.out.println("0 argument constructor");
		Perfume per1 = new Perfume("Cobra",234.2);
		System.out.println("brand is : "+per1.brand);
		System.out.println("cost is "+per1.price);
		Perfume per2 = new Perfume("Silver",549.5,19);
		System.out.println("brand: "+per2.brand);
		System.out.println("price: "+per2.price);
		System.out.println("quantity: "+per2.quantity);
		Perfume per3 = new Perfume("Roses",542.8,10,898);
		System.out.println("brand:   "+per3.brand);
		System.out.println("price:   "+per3.price);
		System.out.println("quantity:   "+per3.quantity);
		System.out.println("cost:   "+per3.cost);
		
		
	}
}