class RocketRunner{
	
	
	public static void main(String[] args)
	{
		//obj 1
		Rocket rocket = new Rocket(400);//Instantiation
		rocket.fuelCapacity= 200;
		rocket.noOfThrusters = 4;
		rocket.details();
		System.out.println("+++++++++++++++++++++++");
		//obj 2
		Rocket rocket1 = new Rocket(500);
		rocket1.country = "Japan";
		rocket1.fuelCapacity = 400;
		rocket1.noOfThrusters = 5;
		rocket1.details();
		System.out.println("+++++++++++++++++++++++");
		// obj 3
		Rocket rocket2 = new Rocket(700);
		rocket2.country = "USA";
		rocket2.fuelCapacity = 600;
		rocket2.noOfThrusters = 8;
		rocket2.details();
	}
}