package patterns;

import java.util.Scanner;

public class pattern10 {
	
	/*
	 *  
						n=6
						*******   *******
						******     ******
						*****       *****
						****         ****
						***           ***
						**             **
						*               *
						*               *
						**             **
						***           ***
						****         ****
						*****       *****
						******     ******
						*******   *******
						
						
						n=4
						*****       *****
						****         ****
						***           ***
						**             **
						*               *
						*               *
						**             **
						***           ***
						****         ****
						*****       *****
						
						n=2
						***           ***
						**             **
						*               *
						*               *
						**             **
						***           ***
						
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String left="";
		String right="";
		String spaces="";
		String str="";
		String res="";
		String[] strArr=new String[n+1];
		System.out.print(str);
		for(int i=n;i>=0;i--) {
		left=printLeft("*",i);
		spaces=printSpaces(" ",i);
		right=printRight("*",i);
		res=right+spaces+left;
		if(i>=0) {
		strArr[i]=res;
		}
		System.out.println(res);
		}
		for(int i=0;i<=strArr.length-1;i++)
		{
			System.out.println(strArr[i]);
		}
		
	}

	private static String printRight(String string, int i) {
	
		for(int k=0;k<i;k++)
		{
			string=string+"*";
		}
		return string;
	}

	private static String printSpaces(String string,int i) {
		
		switch(i)
		{
			case 6:string="   ";
			break;
			case 5:string="     ";
			break;
			case 4:string="       ";
			break;
			case 3:string="         ";
			break;
			case 2:string="           ";
			break;
			case 1:string="             ";
			break;
			default:string="               ";
		}
		return string;
	}

	private static String printLeft(String string, int i) {
		for(int k=0;k<i;k++)
		{
			string=string+"*";
		}
		return string;
	}

}
