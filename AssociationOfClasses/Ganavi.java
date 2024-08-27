class Ganavi
{
	
	String email;
	Clip clip;
	
	Ganavi(String email, Clip clip)
	{
		this.email = email;
		this.clip = clip;
	}
	
	public void ganaviClipDetails(){
		
		System.out.println("Email : "+this.email);
		clip.clipDetails();
	}
}