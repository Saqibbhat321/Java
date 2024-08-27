class Speaker
{
	String brand;//initialized with constructor
	String size = "Small";//initialized with literal
	double cost;// initialized with reference
	String output;// initialized with setter
	
	Speaker(String brand)
	{
		this.brand= brand;
	}
	
	public void setOutput(String output)//:-> non-static or instance method
	{
		this.output = output;
	}
	//non-static or instance method
	public void details()//:-> methods without the static keyword. Invoked with reference
	{
		System.out.println("size is :"+this.size);
		System.out.println("brand is :"+this.brand);
		System.out.println("cost is :"+this.cost);
		System.out.println("output is :"+this.output);
	}

	
}
	
