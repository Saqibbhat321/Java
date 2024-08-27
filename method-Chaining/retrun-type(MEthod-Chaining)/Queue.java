class Queue
{
	
	public static String accept(String name, String msg, int quantity)
	{
		boolean reff =Send1.ServiceProvider(name, msg);
		if(reff == true)
		{
			System.out.println("name  :"+name);
			System.out.println("msg :"+msg);
			String message = "sent";
			System.out.println("Message "+message);
			return message;
		}
		String message1 = "Message Not Sent";
		System.out.println(message1);
		return message1;
	}
	
}


