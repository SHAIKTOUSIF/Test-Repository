package com.ArrayList;

public class Movie implements Comparable<Movie>{
	String name;
	double rating;
	int yor;//Year of releasing
	Movie(){}
	Movie(String name,double rating,int yor){
		super();
		this.name=name;
		this.rating=rating;
		this.yor=yor;
	}
	public int compareTo(Movie movie) {
		//return (int)(this.rating-movie.rating);
		if (this.rating>movie.rating)
			return 1;
		else if(this.rating<movie.rating)
			return -1;
		else
			return 0;
		
	}
}
