import java.util.Scanner;
public class Switch {
 
	public static void main(String arg [])
	{
		int number = 44;
		String size;
		
		switch (number)
		{
		case 29:
		size = "Small";
		break; 
		
		case 42:
		size = "medium";
		break;
		
		case 44:
		size = "large";
		break;
		
		
		default:
			size = "unknown";
			break;
		}
		System.out.println("Size:" + size);
	}
}
