import java.util.*;

/**
  *This program demonstrates a <code>while</code>loop.
  *@version 1.20 2004-02-10
  *author Cay Horstmann
  */
public class Retirement 
{
	public static void main (String[] args)
  {

	Scanner in = new Scanner(System.in);

	System.out.print("How much money do you need to retire?");
    double goal = in.nextDouble();

    System.out.print("How much money will you contribute every year?");
    double payment = in.nextDouble();

    System.out.print("Interest rate in %:");
    double intersetRate = in.nextDouble();

    double balance = 0 ;
    int years = 0 ;

    while (balance < goal)
    {

    	balance +=payment;
    	double interest = balance * intersetRate/100;
    	balance +=interest;
    	years++;
    }

    System.out.println("You can retire in " + years + "years.");
}
}