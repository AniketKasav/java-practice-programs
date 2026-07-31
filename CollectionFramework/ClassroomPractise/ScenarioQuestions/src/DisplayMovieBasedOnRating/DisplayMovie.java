//Q18.Create Movie class:
//movieId
//movieName
//rating
//Store movies in Vector and display movies having rating above 4.
//Description
//Condition:
//rating > 4
//Input
//1 Pushpa 4.5
//2 Leo 3.8
//3 KGF 4.7
//4 Jawan 4.2
//Output
//Top Rated Movies:
//
//Pushpa
//KGF
//Jawan

package DisplayMovieBasedOnRating;
import java.util.*;

class Movie{
	int movieId;
	String movieName;
	float rating;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
}


public class DisplayMovie {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Object>v=new Vector<>();
		System.out.println("Enter number of movies");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			Movie m=new Movie();
			System.out.println("Enter movie id,name and rating ");
			m.setMovieId(sc.nextInt());
			sc.nextLine();
			m.setMovieName(sc.nextLine());
			m.setRating(sc.nextFloat());
			v.add(m);
		}
		
		System.out.println("Top Rated Movies:");
		for(Object obj:v) {
			Movie m=(Movie)obj;
			if(m.getRating()>4) {
				System.out.println(m.getMovieId()+"\t"+m.getMovieName()+"\t"+m.getRating());
			}
		}
		
	}
}





