class SpeakerRunner
{
	public static void main(String[] args)
	{
		//iniatialized using constructor
		Speaker ref = new Speaker("Sony");//this is called instantiation || Speaker is a non- primitive datatype(custom datatype)
		ref.cost = 999;// iniatialized using reference (ref)
		ref.output="Loud music";//iniatialized using setter
		ref.details();//invoking non-static method using reference(ref)
		System.out.println("======================");
		Speaker ref2 = new Speaker("JBL");
		ref2.cost = 2000;
		ref2.output = "Smooth sound";
		ref2.details();
		System.out.println("======================");
		Speaker ref3 = new Speaker("Boat");
		ref3.size = "large";
		ref3.cost = 499;
		ref3.output = "duplicate";
		ref3.details();
		
	}
}