package basic_programs;
import java.util.Scanner;
public class reverse_no {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int n=sc.nextInt();
	
	if(n<=0) {
		System.out.println("invalid number");
	}
	while(n!=0) {
		int rem=n%10;
		n=n/10;
	
	System.out.print(rem);
	}
}

}
