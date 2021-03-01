import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 				/*for dynamic allocation */
		System.out.println("enter the age : ");
		int age=sc.nextInt();
		if(age>=18) 
			{
				System.out.println("Eligible to vote");
			}	
	}
}
