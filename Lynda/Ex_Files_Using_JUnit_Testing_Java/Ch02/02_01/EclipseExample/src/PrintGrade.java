
public class PrintGrade {
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
