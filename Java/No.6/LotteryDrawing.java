import java.util.*;	

public class LotteryDrawing {

	public static void main (String [] args) {

		Scanner in = new Scanner (System.in);

		System.out.print("How much money do you need to drwa ?");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        int[] numbers = new int [n];
        for(int i = 0; i<numbers.length; i++)
        	numbers[i] = i + 1;

        int[] result = new int [k];
        for(int i = 0; i<result.length;i++)
        {
        	int r = (int)(Math.random()*n);

        	result[i] = numbers[r];
        	numbers[r] = numbers[n - 1];
        	n--;
        }

        Arrays.sort(result);
        System.out.print("Bet the following combination.It'll make you rich!");
        for(int r : result)
        	System.out.print(r);

	}
}
