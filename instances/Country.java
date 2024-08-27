class Country
{
	String nameOfCountry;
	String continent;
	State state = new State("Karnataka","Kannada");

	
	public void setnameOfCountry(String nameOfCountry)
	{
		this.nameOfCountry = nameOfCountry;
	}
	public void setContinent(String continent)
	{
		this.continent = continent;
	}
	
	public void printAllDetails(){
		state.details();
		System.out.println("nameOfCountry :" +this.nameOfCountry);
		System.out.println("continent : "+this.continent);
	}
}