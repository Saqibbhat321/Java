class CoffeePowderRunner
{
	public static void main(String[] args)
	{
		CoffeePowder cp = new CoffeePowder();
		CoffeePowder cp1 = new CoffeePowder("Herbal");
		System.out.println("coffee company is: "+cp1.company);
		CoffeePowder cp2 = new CoffeePowder("Himalya",466.43,25.5,"23-05-2024");
		System.out.println("Company: "+cp2.company);
		System.out.println("Cost: "+cp2.cost);
		System.out.println("Weight: "+cp2.weight);
		System.out.println("Manufacturer Date: "+cp2.mfdate);
		CoffeePowder cp3 = new CoffeePowder("Swadhesi","09-10-2022");
		System.out.println("Company: "+cp3.company);
		System.out.println("Manufacturer Date: "+cp3.mfdate);
		CoffeePowder cp4 = new CoffeePowder(50);
		System.out.println("weight: "+cp4.weight);


		
	
	}
}