/*Q23. Write a java program to print this pattern.

			*
	      *   *
		*	*	*
	  *   *   *   * 
	*	*	*	*   *           */
	
	
public class pattern23{
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
				if(j>=6-i && j<=4+i){
					//if(i%2==1 && j%2==1){
					//	System.out.print("*");
					//}else if(i%2==0 && j%2==0){
					//	System.out.print("*");
					//}else{
					//	System.out.print(" ");
					//}
					if((i+j)%2==0){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
					
					
					
				}else{
					System.out.print(" ");
				}
            }
            System.out.println();
        }
    }
}