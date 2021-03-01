import java.util.Scanner;

public class DemoFor {
public static void main(String[] args) {
	int i =0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of integers to be listed out : ");
	int num=sc.nextInt();
	for (i=1;i<=num;i++)
	{
		System.out.println(i);
	}
}
}
