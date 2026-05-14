//38 Swap alternate elements —


import java.util.Scanner;
public class Ass38{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array :  ");
		int n=sc.nextInt();
		System.out.println("Enter the array elements ");
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Swap alternate elements —");
		for(int i=0;i<n-1;i+=2){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}