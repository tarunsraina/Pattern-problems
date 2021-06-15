package patterns;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		/*
		 * 
		 *                      n=6
							    *******   *******
								******     ******
								*****       *****
								****         ****
								***           ***
								**             **
								*               *
		 * 
		 * 
		 */
		
		System.out.println("Enter n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String left="";
		String right="";
		String spaces="";
		String str="";
		System.out.print(str);
		for(int i=n;i>=0;i--) {
		left=printLeft("*",i);
		spaces=printSpaces(" ",i);
		right=printRight("*",i);
		String res=left+spaces+right;
		System.out.println(res);
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

