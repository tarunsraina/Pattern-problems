package patterns;
import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		/*
		 *   n=5
		 *   *
		 *   **
		 *   ***
		 *   ****
		 *   *****
		 *   
		 *   n=3
		 *   *
		 *   **
		 *   ***
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

	}

}

/*
 * 
 *          Output:
 * 
				Enter n
				5
 				*
 				**
 				***
 				****
 				*****
 				
 				Enter n
				7
 				*
 				**
 				***
 				****
 				*****
 				******
 				*******
 
 * 
 * 
 */
