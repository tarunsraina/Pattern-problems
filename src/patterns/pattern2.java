package patterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		/*
		 *   n=5
		 *   *****
		 *   ****
		 *   ***
		 *   **
		 *   *
		 *   
		 *   n=3
		 *   ***
		 *   **
		 *   *
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		String str="";
		for(int i=1;i<=n;i++)
		{
			str=str+"*";
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(str);
			str=str.substring(0,i);
		}

	}

}




/*
 * 
 * 
 * 
 * 
 * 
					Enter n
					5
 					*****
 					****
 					***
 					**
 					*
 					
 	
 	
 					Enter n
					8
 					********
 					*******
 					******
 					*****
 					****
 					***
 					**
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
 * 
 */
