package rakshana;
import java.util.Scanner;
public class First {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size the array");
    int size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("Enter array elements");
    for (int i=0;i<size;i++)
    {
    	a[i]=sc.nextInt();
    }
   int max=a[0];
   for(int i=0;i<a.length;i++)
   {
  for(int j=1;j<a.length;j++)
   {
  	if(a[j]>max)
  	{
  		max=a[j];
  	}
    	}
   
   }
  System.out.println("the max element is" +":"+ max);
}
    
	}
output
  Enter the size the array
4
Enter array elements
22 33 45 67
the max element is:67

  
