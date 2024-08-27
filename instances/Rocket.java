class Rocket{
	
	String country = "India";
	double speed;
	int fuelCapacity;
	int noOfThrusters;
	
	Rocket(double speed)
	{
		this.speed = speed;
	}
	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}
	public void details()
	{
		System.out.println("Country: "+this.country);
		System.out.println("speed: "+this.speed);
		System.out.println("fuelCapacity: "+this.fuelCapacity);
		System.out.println("noOfThrusters: "+this.noOfThrusters);
	}
}