package util;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for palindrome :");
		int n=sc.nextInt();
		
		int temp=1,sum=0,r=0;
		while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
		if(temp==sum)
		{
		   System.out.println("palindrome number ");    
		}
		else
		{
		   System.out.println("not palindrome");    
		}  
		 

	}

}
