class KettleRunner{
	
	public static void main(String[] args)
	{
		Kettle ref = new Kettle();
		ref.price= 200;
		ref.material="steel";
		System.out.println("kettle price is "+ref.price);
		System.out.println("kettle material	is "+ref.material);
		System.out.println("kettle color	is "+ref.color);
	}
}