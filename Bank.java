import java.util.Scanner;
public class Bank {
int amt,bal;
String name;
int accid,ch;
char choice;
Scanner ip;
Bank()

{
	bal=5000;
	String name="prince";
	accid=777;
}
Bank(String name,int accid)
{
	ip=new Scanner(System.in);
	bal=5000;
			this.name=name;
	        this.accid=accid;
			
}
void welcome()
{
	System.out.println("user name="+name);
	System.out.println("Account No="+accid);
}
void deposit()
{
	System.out.println("Enter the amount to be withdrawal");
	amt=ip.nextInt();
	if(amt>0 && amt<=bal)
	{
		welcome();
		System.out.println("amount withdrawal="+amt);
		bal=bal-amt;
		System.out.println("balance amount="+bal);
	}
}
void show()
{
	System.out.println("balance amount="+bal);
}
void menu()
   {	
      do
    {
	System.out.println("press 1 for deposite amount");
	System.out.println("press 2 for withdrawal amount");
	System.out.println("ress 3 for check balance");
	ch=ip.nextInt();
	switch(ch)
	{
	          case 1:
		      deposit();
		      break;
	          case 2:
	         //	withdrawal();
	         	break;
	            case 3:
		         show();
	         	default:
			System.out.println("invalid choice");
	}
	 System.out.println("press y to continue");
	 choice=ip.next().charAt(0);
}

while(choice=='y'  || choice=='Y');

}
public static void main(String arg[])
{
	Bank ob=new Bank("prince",5555);
	ob.menu();
}
}

