package patterns;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		/*
		 * 
		 *         n=6
		 *         * * * * * * 
		 *           * * * * 
		 *             * *
		 *              *
		 *         
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		String str="";
		for(int i=0;i<n;i++)
		{
			str=str+"*";
		}
		printPattern(str,0,str.length());
		

	}

	private static void printPattern(String str,int start,int end) {

		//System.out.println(str);
		String spaces=" ";
		for(int i=0;i<str.length();i++)
		{
			try
			{
				String res=str.substring(start,end);
				if(!res.equals(""))
				{   spaces=spaces+" ";
					System.out.println(spaces+res);
				}
			}
			catch(Exception e)
			{
				System.out.println(spaces+" * ");
				break;
			}
				
			start++;
			end--;
		}
		

	}

}


/*
 * 
 * 
 * 			Enter n
			8
			 * * * * * * * * 
			   * * * * * *
			     * * * * 
			       * *
			        *



			Enter n
			6
			  * * * * * * 
			    * * * *
			      * *
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
