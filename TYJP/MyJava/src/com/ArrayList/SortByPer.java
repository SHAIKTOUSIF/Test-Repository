package com.ArrayList;

import java.util.Comparator;

public class SortByPer implements Comparator<Resume> {
	public int comapare(Resume r1, Resume r2) {
		if(r1.percentage>r2.percentage)
			return 1;
		else if(r1.percentage>r2.percentage)
			return -1;
		else
			return 0;
	}
	

}
