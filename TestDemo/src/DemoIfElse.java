import java.util.Scanner;

public class DemoIfElse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a :");
	int num1=sc.nextInt();
		if(num1<0) {
			System.out.println(" the number entered is negative");
		}
		else if (num1==0) {
			System.out.println("the number entered is zero");
		}
		else
		{
			System.out.println("number entered is positive");
		}
  }
}

