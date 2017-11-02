public class Fib
{
	private static int getFib(int i)
	{
		if(i==1||i==2)
		{
			return 1;
		}
		else 
		{
			return getFib(i - 1) +getFib(i - 2);
		}
	}

	public static void main(String[] args)
	{
		System.out.println("斐波那契数列的前20项为：");
		for(int j = 1; j <=20; j++)
		{
			System.out.print(getFib(j)+"\t");
			if(j%5 == 0)
				System.out.println();
		}
	}
}
