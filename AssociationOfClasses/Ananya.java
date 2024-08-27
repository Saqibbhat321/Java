class Ananya
{
	
	String mobile;
	Knife knife;
	
	Ananya(String mobile, Knife knife)
	{
		this.mobile = mobile;
		this.knife = knife;
	}
	
	public void details()
	{
		System.out.println("mobile: "+this.mobile);
		System.out.println("knife weight: "+knife.getWeight());
		System.out.println("knife height: "+knife.getHeight());
		
	}
}