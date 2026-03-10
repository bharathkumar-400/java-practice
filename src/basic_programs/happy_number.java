package basic_programs;
import java.util.Scanner;

public class happy_number {

	static int happy_no(int n) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
			
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		while(t) {
		System.out.println("enter a number");
		int num=sc.nextInt();
		while(num>9) {
			num=happy_no(num);
		}
		
		if(num==1||num==7) {
			System.out.println("Number is happy number");
		}
		else
		{
			System.out.println("number is not happay number");
		}
			
		
		System.out.println("Do you continue 'yes' or 'no' :");
		
		String ch=sc.nextLine();
		if(ch.equalsIgnoreCase("yes")) {
			t=true;
			
		}
		else
		{
			t=false;
		
		}
		}
	}
}


