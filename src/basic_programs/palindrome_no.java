package basic_programs;
import java.util.Scanner;

public class palindrome_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem=0;
		System.out.println("enter a number :");
		int n=sc.nextInt();
		int copy=n;
		int rev=0;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
	}
		
		if(rev==copy) {
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not a palindrome");
		}
	}

}
