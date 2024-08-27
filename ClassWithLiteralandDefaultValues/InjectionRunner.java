class InjectionRunner
{
	public static void main(String[] args)
	{
		Injection inj = new Injection();
		inj.price = 99;//initializing using reference
		inj.color = "white";
		inj.size = "small";
		inj.usage = "childrens";
		System.out.println("First instance values: "+inj.price);
		System.out.println("First instance values: "+inj.color);
		System.out.println("First instance values: "+inj.size);
		System.out.println("First instance values: "+inj.usage);
		System.out.println("==================================");
		
		Injection inj1 = new Injection();
		inj1.price = 49;
		inj1.color = "blue";
		inj1.size = "medium";
		inj1.usage = "Adults";
		System.out.println("Second instance values: "+inj1.price);
		System.out.println("Second instance values: "+inj1.color);
		System.out.println("Second instance values: "+inj1.size);
		System.out.println("Second instance values: "+inj1.usage);
		System.out.println("==================================");
		
		Injection inj2 = new Injection();
		inj2.price = 90;
		inj2.color = "brown";
		inj2.size = "Large";
		inj2.usage = "Animals";
		System.out.println("Third instance values are : "+inj2.price);
		System.out.println("Third instance values are : "+inj2.color);
		System.out.println("Third instance values are : "+inj2.size);
		System.out.println("Third instance values are : "+inj2.usage);
		System.out.println("==================================");
		
		Injection inj3 = new Injection();
		inj3.price = 78;
		inj3.color = "Dark blue";
		inj3.size = "small";
		inj3.usage = "childrens";
		System.out.println("Fourth instance values: "+inj3.price);
		System.out.println("Fourth instance values: "+inj3.color);
		System.out.println("Fourth instance values: "+inj3.size);
		System.out.println("Fourth instance values: "+inj3.usage);
		System.out.println("==================================");
		
		Injection inj4 = new Injection();
		inj4.price = 10;
		inj4.color = "green";
		inj4.size = "large";
		inj4.usage = "Males";
		System.out.println("Fifth instance values: "+inj4.price);
		System.out.println("Fifth instance values: "+inj4.color);
		System.out.println("Fifth instance values: "+inj4.size);
		System.out.println("Fifth instance values: "+inj4.usage);
		System.out.println("==================================");
		
		Injection inj5 = new Injection();
		inj5.price = 90;
		inj5.color = "brown";
		inj5.size = "Large";
		inj5.usage = "Animals";
		System.out.println("Sixth instance values are : "+inj5.price);
		System.out.println("Sixth instance values are : "+inj5.color);
		System.out.println("Sixth instance values are : "+inj5.size);
		System.out.println("Sixth instance values are : "+inj5.usage);
		System.out.println("==================================");
		
		Injection inj6 = new Injection();
		inj5.price = 96;
		inj5.color = "Darkbrown";
		inj5.size = "Large";
		inj5.usage = "Hens";
		System.out.println("7th instance values are : "+inj6.price);
		System.out.println("7th instance values are : "+inj6.color);
		System.out.println("7th instance values are : "+inj6.size);
		System.out.println("7th instance values are : "+inj6.usage);
		System.out.println("==================================");

		
	}
}