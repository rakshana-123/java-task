package rakshana;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seven digit ticket number");
		long a=sc.nextLong();
		System.out.println("Enter the ticket ID");
		int b=sc.nextInt();
		int count=0;
		while(a>0)
		{
			int digit=(int)(a%10);
			if(digit==b)
			{
				count++;
			}
			a=a/10;
		}
		if(count==0)
		{
			System.out.println("congratulations!! lucky ticket");
		}
		else if(count>3)
		{
			System.out.println("partially lucky");
	
		}
		else
		{
			System.out.println("unlucky ticket");
		}

	}
  output:
  Enter the seven digit ticket number
  2356897
  Enter the ticket ID
  1
  congratulations!! lucky ticket


}
