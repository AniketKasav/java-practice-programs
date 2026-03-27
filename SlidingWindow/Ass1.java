//max subarray sum of size k
//a[]={1,2,3,1,2}; k=2
// {2,3}
// output : 5 

public class Ass1{
	public static void main(String[] args){
		int a[]={1,2,3,1,3};
		int k=2,MaxSum=0,Sum=0;
		for(int i=0;i<k;i++){
			Sum+=a[i];
		}
		MaxSum=Sum;
		for(int i=k;i<a.length;i++){
			Sum=Sum+a[i]-a[i-k];
			if(Sum>MaxSum){
				MaxSum=Sum;
			}
		}
		System.out.printf("The Maximum sum of subarray %d : %d",k,MaxSum);
	}
}