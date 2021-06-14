package patterns;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		/*
		 * 
		 *              n=6
		 *              
						*
						**
						***
						****
						*****
						******
						******
						*****
						****
						***
						**
						*
						
						
		 *        
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		String str="*";
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(str);
			str=str+"*";
		}
		str="";
		for(int i=1;i<=n;i++)
		{
			str=str+"*";
		}
		for(int i=n-1;i>=0;i--)
		{
			if(i==n+1)
			{
				continue;
			}
			System.out.println(str);
			str=str.substring(0,i);
		}

	}

}
