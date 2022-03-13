package util;
import java.util.*;

public class PrintPrime {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number :");
      int N=sc.nextInt();
      PrintPrime pp=new PrintPrime();
      pp.primeNumber(N);
	}
	public void primeNumber(int N) {
     int counter=0;
    System.out.println("Prime numbers are: ");
	
    for(int a=2;a<=N;a++)
    {
       counter = 0;
       for(int b=1;b<=a;b++)
       {
          if(a%b==0)
          {
             counter++;
          }
       }     
       if(counter==2)
       {
          System.out.print(a+" ");
       }
    }
    
  }
}
