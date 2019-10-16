package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.xml.transform.Result;

public class Interview {
public static void main(String[] args) {
	ArrayList<Resume> resume =new ArrayList<Resume>();
	resume.add(new Resume("Tousif",80.0,2019));
	resume.add(new Resume("Prasanna",65.0,2018));
	resume.add(new Resume("Pavan",85.6,2016));
	resume.add(new Resume("Ajay",68.0,2017));
	Iterator<Resume> t1=resume.iterator();
	while(t1.hasNext())
	{
		Resume res= t1.next();
		System.out.println("Name:"+res.name+" Percentage:"+res.percentage+" Year of PassOut"+res.yop);	
	}
	Collections.sort(resume);
	System.out.println("After Sorting");
	while(t1.hasNext())
	{
		Resume res= t1.next();
		System.out.println("Name:"+res.name+"Percentage:"+res.percentage+"Year of PassOut"+res.yop);	
	}
	for(int i=0; i<resume.size();i++)
	{
		System.out.println(resume.get(i).name);
		System.out.println(resume.get(i).percentage);
		System.out.println(resume.get(i).yop);
		
	}
	for(Resume res: resume)
	{
		System.out.println(res);
	}
	
	
	
}
}
