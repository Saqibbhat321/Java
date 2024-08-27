class Clip{
	
	String color;
	String type;
	
	Clip(String color,String type)
	{
		this.color = color;
		this.type = type;
	}
	
	public void clipDetails()
	{
		System.out.println("Color: "+this.color);
		System.out.println("Type: "+this.type);
	}
}