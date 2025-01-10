import java.util.Scanner;
public class Swap {
	int a,b;
	Scanner ip=new Scanner(System.in);
	void set()
	{
		System.out.println("enter the value of a,b");
		a=ip.nextInt();
		b=ip.nextInt();
	}
	void swp()
	{
		a=a^b;
		b=a^b;
		a=a^b;
				
	}
	void show()
	{
		System.out.println("value of a after swap="+a);
		System.out.println("value of b after swap="+b);
		
	}
       public static void main(String arg[])
       {
    	   Swap ob=new Swap();
    	   ob.set();
    	   ob.swp();
    	   ob.show();
       }
}
