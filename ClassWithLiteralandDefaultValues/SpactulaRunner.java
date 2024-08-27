class SpactulaRunner
{
	public static void main(String[] args)
	{
		Spactula sp = new Spactula();
		
		int spprice = sp.price;
		String col = sp.color;
		double wei = sp.weight;
		String us = sp.use;
		System.out.println("before re-initializing: "+spprice);
		System.out.println("before re-initializing: "+col);
		System.out.println("before re-initializing: "+wei);
		System.out.println("before re-initializing: "+us);
		System.out.println("==================================");
		
		sp.price = 888;
		sp.color = "yellow";
		sp.weight = 23.4;
		sp.use = "hitting";
		System.out.println("after re-initializing: "+sp.price);
		System.out.println("after re-initializing: "+sp.color);
		System.out.println("after re-initializing: "+sp.weight);
		System.out.println("after re-initializing: "+sp.use);
		System.out.println("==================================");
		
		Spactula sp1 = new Spactula();
		System.out.println("before re-initializing: "+sp1.price);
		System.out.println("before re-initializing: "+sp1.color);
		System.out.println("before re-initializing: "+sp1.weight);
		System.out.println("before re-initializing: "+sp1.use);
		System.out.println("==================================");
		
		sp1.price = 54;
		sp1.color = "pink";
		sp1.weight = 12.4;
		sp1.use = "throwing";
		System.out.println("after re-initializing: "+sp1.price);
		System.out.println("after re-initializing: "+sp1.color);
		System.out.println("after re-initializing: "+sp1.weight);
		System.out.println("after re-initializing: "+sp1.use);
		System.out.println("==================================");

		
		
	}
}