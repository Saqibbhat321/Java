class Task
{
	
	 static void method()
	 {
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println(i);
		 }
	 }
}
class TaskRunner
{
	public static void main(String[] args)
	{
		Task.method();
	}
}


//NON-STATIC or INSTANCE METHODS are invoked using references(eg: methodName REFERENCE = new methodName())
//while STATIC METHODS are invoked using class name;(eg: className.methodName)

//Arrays are non-Premitive datatype because they have property .length() 
//Difference between primitive and non-Premitive datatypes are we cann't use dot(.)operator(properties) with premitive datatypes