class Metal{
	
	
	String name;
	double cost;
	 
	Metal()
	{
		System.out.println("No Parameter constructor");
	}
	
	Metal(String name)
	{
		this.name = name;
		System.out.println("name initialized using constructor");
	}
	Metal(double cost)
	{
		this.cost = cost;
		System.out.println("cost initialized using constructor");
	}
	Metal(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
		System.out.println("name and cost initialized using constructor");
	}
}