import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the Number of Table");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=10;i++){
		    System.out.println(i+" X "+ n+" "+"="+i*n);
		}
	}
}
