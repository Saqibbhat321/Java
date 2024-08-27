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
		System.out.println("name initialized using constructor, Name: "+name);
	}
	Metal(double cost)
	{
		this.cost = cost;
		System.out.println("cost initialized using constructor, Cost: "+cost);
	}
	Metal(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
		System.out.println("name and cost initialized using constructor, Name: "+name+" Cost: "+cost);
	}
}