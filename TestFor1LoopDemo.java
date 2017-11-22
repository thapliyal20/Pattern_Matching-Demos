import static java.lang.Math.*;

public class TestFor1LoopDemo 
{

	public static void main(String[] args)
	{
		int marks[]=new int[4];
		marks[0]=90;
		marks[1]=10;
		marks[2]=30;
		marks[3]=60;
		
		for(int temp:marks)
		{
			System.out.println(temp);
		}
		
		System.out.println("*****************************");
		
		String cities[]= {"Pune", "Mumbai", "Noida"};
		for(String temp:cities)
		{
			System.out.println(temp);
		}
		System.out.println(" Pi= "+PI);
	}

}
