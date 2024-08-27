class CableRunner
{
	public static void main(String[] args)
	{
		Cable cable = new Cable("black", 10);
		cable.price = 999;
		System.out.println("type :"+cable.type);
		System.out.println("color is "+cable.color);
		System.out.println("price is "+cable.price);
		System.out.println("color is "+cable.quantity);
		
		Cable cable1 = new Cable("white",20);
		double ref2 = cable1.price = 2342;
		cable1.type = "Polymeric";
		System.out.println("type :"+ref2);
		System.out.println("color is "+cable1.color);
		System.out.println("price is "+cable1.price);
		System.out.println("color is "+cable1.quantity);
		
		Cable cable2 = new Cable("steel",12);
		cable2= cable;
		System.out.println("type :"+cable2.type);
		System.out.println("color is "+cable2.color);
		System.out.println("price is "+cable2.price);
		System.out.println("color is "+cable2.quantity);
		
		
		
	}
}