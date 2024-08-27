class CandleRunner
{
	public static void main(String[] abc)
	{
		Candle candle = new Candle();
		Candle candle1 = new Candle(12);
		System.out.println("candle length is: "+candle1.length);
		Candle candle2 = new Candle("jasmine");
		System.out.println("fragerance is : "+candle2.fragerance);
		Candle candle3 = new Candle(50,"mellow");
		System.out.println("fragerance and length is "+candle3.fragerance);
		System.out.println("length is :"+candle3.length);
		Candle candle4 = new Candle(12,30,"housy");
		System.out.println(" length is :"+candle4.length);
		System.out.println("cost is : "+candle4.cost);
		System.out.println("length is : "+candle4.length);
		
		
		
		
	}
}