class CoffeePowder
{
	double cost;
	String company;
	double weight;
	String mfdate;
	
	CoffeePowder()
	{
		System.out.println("called no parameter constructor");
	}
	CoffeePowder(String company)
	{
		this.company = company;
		System.out.println("called String constructor");
	}
	CoffeePowder(String company, double cost, double weight, String mfdate)
	{
		this.company = company;
		this.cost = cost;
		this.weight = weight;
		this.mfdate = mfdate;
		
	}
	CoffeePowder(String company, String mfdate)
	{
		this.company = company;
		this.mfdate = mfdate;
	}
	CoffeePowder(double weight)
	{
		this.weight = weight;
	}
}