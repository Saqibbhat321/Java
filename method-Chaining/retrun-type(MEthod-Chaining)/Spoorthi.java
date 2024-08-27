class Spoorthi
{
	public static String sendMsg(String name, String msg, int quantity)
	{
		String ref5 = Queue.accept(name,msg,quantity);
		
		return ref5;
	}
}