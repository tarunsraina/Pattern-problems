package patterns;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		/*
		 *     n=6
		 *     
		 *     * * * * * *
		 *     *         *
		 *     *         *
		 *     *         *
		 *     *         *
		 *     * * * * * *
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		String s = null;
		for(int i=0;i<n;i++)
		{
			if(i==0||i==n-1)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			else
			{
				String str="*";
				for(int t=0;t<=n*2-4;t++) //by trial and error
				{
					str=str+" ";
				}
				str=str+"*";
				System.out.println(str);		
			}
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
							6
 							* * * * * * 
							*         *
							*         *
							*         *
							*         *
							* * * * * * 
						
						
						Enter n
						4
						* * * * 
						*     *
						*     *
						* * * * 

						
						
						Enter n
						1
						*
	
					
					Enter n
					2
					* * 
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
 * 
 * 
 * 
 * 
 * 
 * 
 */
