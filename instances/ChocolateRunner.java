class ChocolateRunner{
	
	
	
	public static void main(String[] atgs)
	{
		Chocolate choco = new Chocolate("Kwality");
		choco.price = 99;
		choco.flavour = "Vanilla";
		choco.size = "medium";
		choco.displayDetails();
		
		Chocolate choc1 = new Chocolate("Arun");
		choc1.price = 29;
		choc1.flavour = "chocolate";
		choc1.size = "Large";
		choc1.displayDetails();
	}
}