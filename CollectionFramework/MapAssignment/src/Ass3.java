//3.	Nested Map – Find Highest Marks
//Given:
//Map<String, Map<String, Integer>> studentData
//Find the student who has the highest marks in Mathematics.

/*
Example
studentData

Rahul → {
    Mathematics: 85
    Science: 90
    English: 78
}

Priya → {
    Mathematics: 95
    Science: 88
    English: 91
}

Amit → {
    Mathematics: 82
    Science: 89
    English: 84
}
Result:
Student with highest Mathematics marks:
Priya → 95
*/

import java.util.HashMap;
import java.util.Scanner;


public class Ass3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,HashMap<String,Integer>>mp=new HashMap<>();
		System.out.println("Enter the number of student ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.print("Enter student name :");
			String name=sc.nextLine();
			HashMap<String,Integer>temp=new HashMap<>();
				System.out.print("Enter math marks:");
				int math=sc.nextInt();
				temp.put("Math", math);
				System.out.print("Enter science marks:");
				int science=sc.nextInt();
				temp.put("Science", science);
				System.out.print("Enter english marks:");
				int english=sc.nextInt();
				sc.nextLine();
				temp.put("English", english);
			mp.put(name, temp);
		}
		
		System.out.println("\n=======OutPut=======");
		System.out.println("Student with highest Mathematics marks:");
		String student = "";
		int mm=Integer.MIN_VALUE;
		for(String name : mp.keySet()) {
		    HashMap<String,Integer> temp = mp.get(name);

		    if(temp.get("Math") > mm) {
		        mm = temp.get("Math");
		        student = name;
		    }
		}

		System.out.println(student + " → " + mm);
	}

}





































