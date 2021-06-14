package patterns;

import java.util.Scanner;

public class pattern8 {
	
	/*
	 * 
	 * 
	 * 
						 n= 6
					      *
					     *
					    *
					   *
					  *
					 *
					** * * * * * 
					 *
					  *
					   *
					    *
					     *
					      *

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		String str="*";
		int n=sc.nextInt();
		String spaces=" ";

		for(int i=0;i<n;i++)
		{
			spaces+=" ";
		}
		for(int i=n;i>0;i--)
		{
			spaces=spaces.substring(0,spaces.length()-1);
			System.out.println(spaces+"*");
			
		}
		for(int i=0;i<n;i++)
		{
			str=str+"*"+" ";
		}
		System.out.println(str);
		str="*";
		for(int i=0;i<n;i++)
		{
			System.out.println(spaces+str);
			spaces=spaces+" ";
		}
		
		
		
		
		

	}


}
