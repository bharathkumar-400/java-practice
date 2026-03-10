package basic_programs;

public class Sum_of_each_number_until_single_digit {

	static int summation(int n) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
		public static void main(String[] args) {
			int num=1234;
			while(num>9) {
			num=summation(num);
			
		}
	System.out.println(num);
	
	}
}


