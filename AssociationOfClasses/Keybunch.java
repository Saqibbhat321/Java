class Keybunch
{
	String material;
	Key key;
	
	Keybunch(String material,Key key)
	{
		this.material = material;
		this.key = key;
	}
	
	public void keyBunchDetails()
	{
		System.out.println("material: "+this.material);
		System.out.println("key details: "+this.key);
		key.keyDetails();
		
	}
}