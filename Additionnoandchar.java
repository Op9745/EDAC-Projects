import java.util.Scanner;
public class Additionnoandchar {

	public static void main(String[] args) {
		int no1,no2,sum;
		char ch1,ch2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		no1=sc.nextInt();
		no2=sc.nextInt();
		sum=no1+no2;
		System.out.println(sum);
		System.out.println("Enter the two characters:");
		ch1=sc.next().charAt(0);
		ch2=sc.next().charAt(0);
		System.out.println("The concatenated chars are:"+ch1+ch2);
	}
}