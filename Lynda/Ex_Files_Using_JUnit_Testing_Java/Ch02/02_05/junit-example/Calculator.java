public class Calculator {
	public int summation(int[] nums)
	{
		int sum=0;
		for(int num:nums)
			sum +=num;
		return sum;
	}
}