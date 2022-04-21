import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int num1,num2;
		System.out.println("Enter the Two Number");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Before Swap:\n "+num1+" "+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swap:\n "+num1+" "+num2);
	}
}
