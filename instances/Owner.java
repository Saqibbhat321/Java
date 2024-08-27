class Owner{
	
	
	String name;
	int age;
	String gender;
	
	
	Owner(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void details()
	{
		System.out.println("Name : "+this.name);
		System.out.println("age : "+this.age);
		System.out.println("gender : "+this.gender);
	}
}