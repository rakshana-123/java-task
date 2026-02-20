package rakshana;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int temp=a;
	int b=0;
	
	while(temp!=0)
	{
	int c=temp%10;
	b=b*10+c;
	temp/=10;
	}
	System.out.println(b);
	if(b==a)
	{
		System.out.println("This number is palingrom");
	}
	else
	{
		System.out.println("this number is not a palingrom");
	}
		}

}
output
  Enter the number
121
121
This number is palingrom
