//1.	Nested Map – Student Marks
//Create a Map<String, Map<String, Integer>> where the outer key is
//the student name and the inner Map contains subject names and marks. Write a program to: 
//o	Add 3 students. 
//o	Add marks for 3 subjects. 
//o	Display each student's marks.
/*
Student Marks

Rahul → {Math: 85, Science: 90, English: 78}

Priya → {Math: 92, Science: 88, English: 95}

Amit → {Math: 76, Science: 81, English: 84}
Displayed output:
Rahul's Marks:
Math = 85
Science = 90
English = 78

Priya's Marks:
Math = 92
Science = 88
English = 95

Amit's Marks:
Math = 76
Science = 81
English = 84
*/

import java.util.*;


public class Ass1 {

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
		for(Map.Entry<String,HashMap<String,Integer>> Entry:mp.entrySet()) {
			String name=Entry.getKey();
			System.out.println(name+"'s Marks :");
			HashMap<String,Integer>temp=Entry.getValue();
			for(Map.Entry<String,Integer>entry:temp.entrySet()) {
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
			
		}
	}

}
















