package basic_programs;
import java.util.Scanner;
public class sum_of_even_no_and_add_no {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int e_sum=0;
		int o_sum=0;
		
		while(n!=0) {
		int rem=n%10;
		if(rem%2==0) {
			e_sum+=rem;
		}
			else {
				o_sum+=rem;
			}
		
		n=n/10;
		}
		System.out.println(o_sum+"  is odd sum");
		System.out.println(e_sum+"  is even sum");
			
	}
	
	}


