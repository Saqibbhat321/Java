class MusicalInstrumentRunner
{
	public static void main(String[] args)
	
	{
		
		MusicalInstrument mi = new MusicalInstrument();
		System.out.println("Using mi reference: "+mi.name);
		System.out.println("Using mi reference: "+mi.color);
		System.out.println("Using mi reference: "+mi.brand);
		System.out.println("Using mi reference: "+mi.price);
		mi.name = "Guitar";
		mi.brand = "Roses";
		mi.price = 4999;
		mi.color = "white";
		System.out.println("Using mi reference: "+mi.name);
		System.out.println("Using mi reference: "+mi.color);
		System.out.println("Using mi reference: "+mi.brand);
		System.out.println("Using mi reference: "+mi.price);
		System.out.println("======================");
		
		MusicalInstrument mi1 = new MusicalInstrument();
		mi1.name = "Drums";
		mi1.brand = "Key and Lock";
		mi1.price = 2999;
		mi1.color = "Brown";
		System.out.println("Using mi1 reference: "+mi1.name);
		System.out.println("Using mi1 reference: "+mi1.color);
		System.out.println("Using mi1 reference: "+mi1.brand);
		System.out.println("Using mi1 reference: "+mi1.price);
		System.out.println("======================");
		
		MusicalInstrument mi2 = new MusicalInstrument();
		mi2.name = "flure";
		mi2.brand = "keys";
		mi2.price = 999;
		mi2.color = "yellow";
		System.out.println("Using mi2 reference: "+mi2.name);
		System.out.println("Using mi2 reference: "+mi2.color);
		System.out.println("Using mi2 reference: "+mi2.brand);
		System.out.println("Using mi2 reference: "+mi2.price);
		System.out.println("======================");
		
		MusicalInstrument mi3 = new MusicalInstrument();
		mi3.name = "banhces";
		mi3.brand = "broski";
		mi3.price = 869;
		mi3.color = "black";
		System.out.println("Using mi3 reference: "+mi3.name);
		System.out.println("Using mi3 reference: "+mi3.color);
		System.out.println("Using mi3 reference: "+mi3.brand);
		System.out.println("Using mi3 reference: "+mi3.price);
		System.out.println("======================");
		
		MusicalInstrument mi4 = new MusicalInstrument();
		mi4.name = "hogg";
		mi4.brand = "blues";
		mi4.price = 699;
		mi4.color = "Turmeric";
		System.out.println("Using mi4 reference: "+mi4.name);
		System.out.println("Using mi4 reference: "+mi4.color);
		System.out.println("Using mi4 reference: "+mi4.brand);
		System.out.println("Using mi4 reference: "+mi4.price);
		System.out.println("======================");
		
		MusicalInstrument mi5 = new MusicalInstrument();
		mi5.name = "kontica";
		mi5.brand = "vasel and base";
		mi5.price = 897;
		mi5.color = "mustard Blue";
		System.out.println("Using mi5 reference: "+mi5.name);
		System.out.println("Using mi5 reference: "+mi5.color);
		System.out.println("Using mi5 reference: "+mi5.brand);
		System.out.println("Using mi5 reference: "+mi5.price);
		System.out.println("======================");
		
		MusicalInstrument mi6 = new MusicalInstrument();
		mi6.name = "gabru";
		mi6.brand = "brassick";
		mi6.price = 39;
		mi6.color = "pink";
		System.out.println("Using mi6 reference: "+mi6.name);
		System.out.println("Using mi6 reference: "+mi6.color);
		System.out.println("Using mi6 reference: "+mi6.brand);
		System.out.println("Using mi6 reference: "+mi6.price);
		System.out.println("======================");
		
		
		
	}
}