import java.util.Scanner;
class Banking{
static int Amount=5000;

static void WithDraw(){
	
         int W_Amount;
		 
         System.out.println("Enter the WithDraw Amount\n");
		 
         Scanner am=new Scanner(System.in);
		 
		 W_Amount=am.nextInt();
		 
		 if(W_Amount<Amount){
			 
			 Amount=Amount-W_Amount;
			 
			 System.out.println("WithDraw Amount "+W_Amount);
		 }
		 else{
			 System.out.println("AMOUNT NOT ENOUGH");
		 }
		 }
static void DepositAmount(){
	
         int D_Amount;
		 
         System.out.println("Enter the Deposit Amount\n");
		 
         Scanner am=new Scanner(System.in);
		 
         D_Amount=am.nextInt();
		 
         Amount=D_Amount+Amount;
		 
         System.out.println("Deposit Amount "+D_Amount);
		 
         System.out.println("After Deposit Total Amount "+Amount);
		 
		 }
static void CheckBalance(){
	
	System.out.println(Amount);
	
}

    public static void main(String[] args){
		
		int n;
		
		String or_name="ADMIN";
		
		String or_pass="PASSWORD";
		
		String UserName;
		
		String Password;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Username:");
		
		UserName=sc.nextLine();
		
		System.out.println("Enter the Password:");
		
		Password=sc.nextLine();
		
		if(UserName.equals(or_name)){
			
			if(Password.equals(or_pass)){
				do{
					System.out.println("1_WITHDRAW\n2_DEPOSIT_AMOUNT\n3_CHECK_BALANCE\nexit enter 0");
					
					System.out.println("Choose above One...");
					
					n=sc.nextInt();
					
					switch(n){
						
						case 1:WithDraw();
						break;
						
						case 2:DepositAmount();
						break;
						
						case 3:CheckBalance();
						break;
						
						default:System.out.println("Please Choose Correct One.");
					}
				}while(n!=0);
			}
			
			System.out.println("Enter the Correct Password:");
		}
		
		System.out.println("Enter the Correct UserName:");
		
	}
}
