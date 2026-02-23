package rakshana;

public class Task {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)//rows
		{
			for(int j=i;j<=5;j++)//column space
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)//pattern
			{
			    System.out.print("* ");	
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
			    System.out.print("* ");	
			}
			System.out.println();
		}

output:
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
