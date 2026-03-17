/*Q50. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325	
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 				
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321				
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135				
Case 5 : Store only prime number at the same index of digit.
	   Output :- 2573  5  253  25  357  235                           */
	   
import java.util.Scanner;

public class Ass49{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the array size : ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int ch;
		
		do{
			System.out.println("\n1.Sort digits in Ascending Order");
			System.out.println("2.Sort digits in Descending Order");
			System.out.println("3.Sum of digits");
			System.out.println("4.Even digits first then Odd digits");
			System.out.println("5.Store only Prime digits");
			System.out.println("6.Exit");
			
			System.out.print("Enter your choice : ");
			ch=sc.nextInt();
			
			switch(ch){
				
				case 1:
				for(int i=0;i<n;i++){
					
					int temp=a[i];
					int d[]=new int[10];
					int k=0;
					
					while(temp>0){
						d[k++]=temp%10;
						temp/=10;
					}
					
					for(int x=0;x<k-1;x++){
						for(int y=0;y<k-x-1;y++){
							if(d[y]>d[y+1]){
								int t=d[y];
								d[y]=d[y+1];
								d[y+1]=t;
							}
						}
					}
					
					for(int x=0;x<k;x++){
						System.out.print(d[x]);
					}
					System.out.print(" ");
				}
				break;
				
				
				case 2:
				for(int i=0;i<n;i++){
					
					int temp=a[i];
					int d[]=new int[10];
					int k=0;
					
					while(temp>0){
						d[k++]=temp%10;
						temp/=10;
					}
					
					for(int x=0;x<k-1;x++){
						for(int y=0;y<k-x-1;y++){
							if(d[y]<d[y+1]){
								int t=d[y];
								d[y]=d[y+1];
								d[y+1]=t;
							}
						}
					}
					
					for(int x=0;x<k;x++){
						System.out.print(d[x]);
					}
					System.out.print(" ");
				}
				break;
				
				
				case 3:
				for(int i=0;i<n;i++){
					
					int temp=a[i];
					int sum=0;
					
					while(temp>0){
						sum+=temp%10;
						temp/=10;
					}
					
					System.out.print(sum+" ");
				}
				break;
				
				
				case 4:
				for(int i=0;i<n;i++){
					
					int temp=a[i];
					String even="";
					String odd="";
					
					while(temp>0){
						
						int d=temp%10;
						
						if(d%2==0)
						even=d+even;
						
						else
						odd=d+odd;
						
						temp/=10;
					}
					
					System.out.print(even+odd+" ");
				}
				break;
				
				
				case 5:
				for(int i=0;i<n;i++){
					
					int temp=a[i];
					String prime="";
					
					while(temp>0){
						
						int d=temp%10;
						int count=0;
						
						for(int j=1;j<=d;j++){
							if(d%j==0)
							count++;
						}
						
						if(count==2){
							prime=d+prime;
						}
						
						temp/=10;
					}
					
					System.out.print(prime+" ");
				}
				break;
				
				
				case 6:
				System.out.println("Thank you for using program !!");
				break;
				
				
				default:
				System.out.println("Invalid choice !!");
			}
			
		}while(ch!=6);
		
	}
}