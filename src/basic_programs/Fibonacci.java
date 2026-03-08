package basic_programs;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int fib1=0,fib2=1,fib3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		System.out.print(fib1+ " "+ fib2+" ");
		for(int i=2;i<n;i++) {
		fib3=fib1+fib2;
		System.out.print(fib3+" ");
		fib1=fib2;
		fib2=fib3;
		}
		
	}
}


