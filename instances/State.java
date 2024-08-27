class State{
	
	
	String nameOfState;
	String language;
	CapitalCity cc = new CapitalCity("Bengaluru",999999);

	State(String nameOfState, String language)
	{
		this.nameOfState = nameOfState;
		this.language = language;
	}
	
	public void details()
	{
		cc.detailsCC();
		System.out.println("nameOfState: "+this.nameOfState);
		System.out.println("language: "+this.language);
		
	}
}