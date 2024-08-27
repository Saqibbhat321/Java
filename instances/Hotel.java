class Hotel
{
	
	String name = "14th Avenue";
	String owner = "Saqib";
	Owner owner = new Owner("historic",29,"male");
	public void allDetails()
	{
		
		owner.details();
		System.out.println("Hotel Name is :"+this.name);
		System.out.println("owner of hotel is :"+this.owner);
	}
}