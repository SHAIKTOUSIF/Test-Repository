package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BoxOffice  {
	public static void main(String[] args) {
		Movie ob1 =new Movie("Bahubali 2",8.8,2016);
		Movie ob2=new Movie("Chichore",9.2,2019);
		Movie ob3=new Movie("Avengers -End Game",9.8,2017);
		Movie ob4=new Movie("Pehlwan",7.2,2019);
		ArrayList<Movie> movie =new ArrayList<>();
		movie.add(ob1);
		movie.add(ob2);
		movie.add(ob3);
		movie.add(ob4);
		System.out.println("Before Sorting");
		for(Movie m: movie)
		{
			System.out.println("Name"+m.name);
			System.out.println("Rating"+m.rating);
			System.out.println("Year of Release"+m.yor);
			System.out.println("________________ ");
		}
		Collections.sort(movie);
		System.out.println("After Sorting");
		for( Movie m :movie) {
		

		System.out.println("Name"+m.name);
		System.out.println("Rating"+m.rating);
		System.out.println("Year of Release"+m.yor);
		
	}
		//System.out.println(ob1.compareTo(ob2));
		//System.out.println(ob2.compareTo(ob1));
		
		
		
	}

}
