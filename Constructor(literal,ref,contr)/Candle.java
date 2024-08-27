class Candle
{
	double length;
	double cost;
	String fragerance;
	
	Candle()
	{
		System.out.println("No paramenter Constructor");
	}
	
	Candle(double length)
	{
	System.out.println("double Constructor");
	this.length=length;
		
	}
	Candle(double length, double cost)
	{
	System.out.println("double, double Constructor");
	this.length=length;
	this.cost=cost;

	}
	Candle(double cost, String fragerance)
	{
		System.out.println("double, string Constructor");
		this.cost = cost;
		this.fragerance = fragerance;

	}
	Candle(String fragerance)
	{
		System.out.println("string	Constructor");
		this.fragerance = fragerance;
	}
	
	
	Candle(double length, double cost, String fragerance)
	{
		System.out.println("made string,double,double contructor");
		
		this.length = length;
		this.cost = cost;
		this.fragerance = fragerance;
	}
}