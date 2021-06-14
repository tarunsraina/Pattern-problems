package patterns;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		/*
		 * 
		 * 			n=5
		 * 
		 * 			* * * * *
		 * 			  * * * *
		 *              * * *
		 *                * *
		 *                  *
		 *               
		 * 
		 */
		
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		String spaces="";
		int n=sc.nextInt();
		String str="";
		for(int i=0;i<n;i++)
		{
			str=str+"*";
		}
		System.out.println(str);
		for(int i=0;i<n;i++)
		{
			spaces=spaces+" ";
			String s=str.substring(i+1,n);
			System.out.println(spaces+s);
		}
		
	}

}


/*
 * 
 * 
 * 
				Enter n
				6
 				******
 				*****
 				****
 				***
 				**
 				*
 		
 		
 		Enter n
		4
		****
		 ***
		  **
		   *
		   *
		   
		    Enter n
			1
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
 * 
 * 
 * 
 * 
 * 
 */
