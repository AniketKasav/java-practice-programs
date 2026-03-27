public class Function{
	public static void main(String[] args){
		
		table(5);
	}
	public static void table(int no){
			for(int i=1;i<=10;i++){
				System.out.printf("%d * %d= %d\n",no,i,no*i);
			}
		}
}