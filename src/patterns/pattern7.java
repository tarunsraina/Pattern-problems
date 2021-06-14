package patterns;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 					Right arrow
		 * 
		 * 
		 					n=6
							*
							 *
							  *
							   *
							    *
							     *
							*******
							     *
							    *
							   *
							  *
							 *
							*
					
					
					n=1
					*
					**
					*
		 
		 							n=4
										*
										 *
										  *
										   *
										*****
										   *
										  *
										 *
										*
		 
		 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		String str="*";
		int n=sc.nextInt();
		String spaces="";
		for(int i=0;i<n;i++)
		{
			System.out.println(spaces+str);
			spaces=spaces+" ";
		}
		for(int i=0;i<n;i++)
		{
			str=str+"*";
		}
		System.out.println(str);
		
		
		for(int i=n;i>0;i--)
		{
			spaces=spaces.substring(0,spaces.length()-1);
			System.out.println(spaces+"*");
			
		}

	}

}
