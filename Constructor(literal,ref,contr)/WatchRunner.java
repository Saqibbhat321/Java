class WatchRunner
{
	public static void main(String[] args)
	{
		Watch watch = new Watch("Silver","Dial");
		
		System.out.println("brand is :"+watch.brand);
		double ref = watch.price = 4999;
		System.out.println("price is :"+ref);
		System.out.println("color is :"+watch.color);
		System.out.println("type is :"+watch.type);
		
		Watch watch1 = new Watch("Gold","Digital");
		watch1.brand = "Timex";
		 System.out.println("brand is now :"+watch1.brand);
		 double ref1 = watch1.price = 2999;
		 System.out.println("price is now :"+ref1);
		 System.out.println("Color of watch is now:"+watch1.color);
		 System.out.println("type of watch is now:"+watch1.type);
		 
		 
		
		
	}
}