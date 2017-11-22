import java.util.Scanner;
import java.util.regex.Pattern;
public class TestPatternDemo 
{

	public static void main(String[] args)
	{
		String inputStr = "Test String";
		String pattern = "Test String";
		
		boolean patternMatched = Pattern.matches(pattern,  inputStr);
		System.out.println(patternMatched);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :\n");
		String firstName=sc.next();
		String namePattern="[A-Z][a-z]+";
		
		if(Pattern.matches(namePattern, firstName))
		{
			System.out.println(" Welcome to Capgemini :"+firstName);
		}
		else
		{
			System.out.println(" Invalid name should have only characters"+
					 "and should start with Capital. ");
		}
	}

}
