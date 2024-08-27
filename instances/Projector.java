class Projector{
	
	
	String company="havells";
	String type;
	String color;
	double weight;
	
	Projector(String type)
	{
		this.type = type;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	
	
	public void displayDetails()
	{
		System.out.println("company: "+this.company);
		System.out.println("type: "+this.type);
		System.out.println("color: "+this.color);
		System.out.println("weight: "+this.weight);
	}
	

}