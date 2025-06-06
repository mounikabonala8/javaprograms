import java.util.*;
public class Switchcase{

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    switch(n)
	    {
	        case 1:System.out.println("monday");
	        case 2:System.out.println("tuesday");
	        case 3:System.out.println("wednesday");
	        case 4:System.out.println("thursday");
	        case 5:System.out.println("friday");
	        case 6:System.out.println("saturday");
	        case 7:System.out.println("sunday");
	        break;
	        default:System.out.println("invalid");
	    }
}
}