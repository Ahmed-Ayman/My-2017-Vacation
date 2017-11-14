/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeansexample;

/**
 *
 * @author Producer
 */
public class PrintGrades {
    	public String print(int grade)
	{
		if(grade > 93)
			return "You got an A!";
		else if(grade > 83)
			return "You received a B";
		else if(grade > 73)
			return "You received a C";
		else
			return "You need to study more";
	}
    
}
