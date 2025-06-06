import java.util.*;
public class EvenandOddcount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ecount=0;
		int ocount=0;
		while(n!=0)
		{
		    int rem =n%10;
		    if(rem%2==0){
		        ecount+=1;
		    }
		    else{
		    ocount+=1;
		    }
		    n=n/10;
		}
		System.out.println(ecount);
	    System.out.println(ocount);
	    
	}
}
