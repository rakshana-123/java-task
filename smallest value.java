package rakshana;
import java.util.Scanner;
class oops{
	private int a,b,c;
	oops(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void is_small() {
		 if(a==b && b==c)
		    {
		    	System.out.println(" all numbers are equal");
		    }
		    else {
		    int d=a<b?a:b;
		    int e=d<c?d:c;
		    System.out.println("smallest number =" + e);
		    }
		
	}
}
public class Task1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    System.out.println("enter the third number");
    int c=sc.nextInt();
    oops is=new oops(a, b, c);
    is.is_small();
}

}

output:
enter the first number
12
enter the second number
67
enter the third number
90
smallest number =12

