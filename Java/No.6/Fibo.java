public class Fibo
{
	public static void main (String[] args)
	{
      
       for(int j = 0; j <=20;j++)
       {
          System.out.print(getFibo(j)+"\t");
          if(j%5 == 0)
				System.out.println();
       }
	}

	private static int getFibo(int i)
	{
		if(i==0)
		{
			return 0;
		}

		else if(i ==1|| i==2)
		{
			return 1;
		}
		else 
		{
			return getFibo(i - 1)+ getFibo(i - 2);
		}
	}

}