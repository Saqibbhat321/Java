class Calculator {

	int num;
	
	Calculator(int num)
	{
	    this.num = num;
	}
	
	public int sumOfDigits()
	{
	    int sum =0;
	    int temp =num;
	    while(temp>0)
	    {
	        sum +=temp%10;
	        temp /=10;
	    }
	    return sum;
	}

}