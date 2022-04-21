import java.util.Random;
import java.util.Scanner;
public class FindNumber
{
	public static void main(String[] args) {
	    int ans,inp;
	    final int MAX=20;
	    boolean find=false;
	    Random rd=new Random();
	    Scanner sc=new Scanner(System.in);
	    ans=rd.nextInt(MAX)+1;
	    while(!find){
	       System.out.println("FIND ME");
	       
	       inp=sc.nextInt();
	       if(inp>ans){
	           System.out.println("Too high, try again.");
	       }
	       else if(inp<ans){
	           System.out.println("Too low, try again.");
	       }
	       else{
	           System.out.println("SURRENDER🏳️️");
	           find=true;
	       }
	    }
	}
}
