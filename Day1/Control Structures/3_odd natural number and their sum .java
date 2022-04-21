import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,sum=0;
	    System.out.println("Enter the nth Number...");
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(int i=0;i<n;i++){
	        if(i%2!=0){
	            System.out.println(i);
	            sum=sum+i;
	        }
	    }
	    System.out.println("The Sum Of ODD Number: "+sum);
	}
}
