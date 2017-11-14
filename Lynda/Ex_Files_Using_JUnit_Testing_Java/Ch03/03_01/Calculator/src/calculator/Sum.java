/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Producer
 */
public class Sum {
    public int summation(int[] nums)
	{
		int sum=0;
		for(int num:nums)
			sum +=num;
		return sum;
	}
    
}
