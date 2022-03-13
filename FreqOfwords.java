package util;
import java.util.*;
public class FreqOfwords {
	static void Countfreq(String str)
	{
	  String temp="";
	  for(int i=0;i<str.length();i++)
	  { 
		  if(str.charAt(i)!=' '&&i<str.length()-1) 
		  {
			 temp=temp+str.charAt(i);
		  }
		  else {
		System.out.println("frequency of  "+temp+" is: ");
		for(int k=0;k<temp.length();k++)
		{
		int count=1;
			for(int j=k+1;j<temp.length();j++)
			{
				if(temp.charAt(k)==temp.charAt(j))
						{
					      count++;
						}
			}
			System.out.println(temp.charAt(k)+" - "+count);
		 }
		temp="";
	  }
	  }
	}
	

	public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter an article :");
     String article=sc.nextLine();
     Countfreq(article);
	}

}
