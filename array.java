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

#search array

package rakshana;
import java.util.Scanner;
public class array {
	int search(int a[],int key)
	{
		  for(int i=0;i<a.length;i++)
		  {
        	  if(key==a[i])
        	  {
                     return i;
        	  }
		  }
		  return -1;
		  }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements:");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
        System.out.println("array elements are");
          for(int i=0;i<a.length;i++)
          {
        	  System.out.println(a[i]);
        	  
          }
          System.out.println("enter the search element:");
          int key=sc.nextInt();
          array s=new array();
          int x=s.search(a, key);
        		  if(x==-1)
        		  {
        			  System.out.println("element not found");

        		  }
        		  else
        		  {
        			  System.out.println("element found "+x);
        		  }
          
        	}
}
	
output:
enter the size of the array:
5
Enter the elements:
11
22
33
44
55
array elements are
11
22
33
44
55
enter the search element:
44
element found 3

	
	
	
	

	  
	

  
