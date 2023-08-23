/*
*             *             
* *           * *           
* * *         * * *         
* * * *       * * * *       
* * * * *     * * * * *     
* * * * * *   * * * * * *   
* * * * * * * * * * * * * *      */

package CombinationOfPatterns;

public class P1 {

	public static void rtyuiolmain(String[] args) {
		int n=7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			for(int j=0;j<n;j++){
				if(i>=j)
					System.out.print("* ");
				else
					System.out.print("  ");
		}
			System.out.println();
	}
	}
}
