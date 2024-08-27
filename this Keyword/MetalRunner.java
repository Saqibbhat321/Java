class MetalRunner
{
	public static void main(String[] args)
	{
		Metal metal = new Metal();
		Metal metal1 = new Metal("Iron");
		System.out.println("metal name is: "+metal1.name);
		Metal metal2 = new Metal(2345.3);
		System.out.println("metal cost is: "+metal2.cost);
		Metal metal3 = new Metal("Platinum", 54233.2);
		System.out.println("metal name and cost is: "+metal3.name);
		
	}
}