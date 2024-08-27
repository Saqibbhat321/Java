class CapitalCity
{
	String nameOfCity;
	int population;
	
	
	CapitalCity(String nameOfCity, int population)
	{
		this.nameOfCity = nameOfCity;
		this.population = population;
	}
	public void detailsCC()
	{
		System.out.println("nameOfCity: "+nameOfCity);
		System.out.println("population: "+population);
		
	}
}