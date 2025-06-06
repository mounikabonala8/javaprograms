import java.util.*;
public class Armstrong{

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int count=0;
	    double sum=0;
	    int l=n;
	    int m=n;
	    while(n!=0){
	        int rem=n%10;
	        count+=1;
	        n=n/10;
	    }
	    while(m!=0){
	        int rem=m%10;
	        sum=sum+Math.pow(rem,count);
	        m=m/10;
	    }
	    if(sum==l)
	    {
	        System.out.println("armstrong");
	    }
	    else{
	        System.out.println(" not armstrong");
	    }
}
}