
class Calculator
{
		
		public void add(String name, int ... nums)
		{
			int sum=0;
			for(int temp:nums)
			{
				sum=sum+temp;
			}
			System.out.println(name+ " Sum = "+sum);
		}
}

public class TestVarArdDemo 
{
	public static void main(String[] args) 
	{
		Calculator cc= new Calculator();
		cc.add("Kritika",70,90,90,67,45);

	}
}
