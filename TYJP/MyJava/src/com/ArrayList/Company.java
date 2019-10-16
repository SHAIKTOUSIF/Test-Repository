package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	public static void main(String[] args) {
		ArrayList<Employee> employee= new ArrayList<>();
		employee.add(new Employee(1, 12.000));
		Employee e1=new Employee(2, 8.8);
		employee.add(e1);
		employee.add(new Manager(2, 12.0, "finance"));
		System.out.println(employee);
		//access individual object of the array list using get()
		for(int i=0; i<employee.size(); i++) 
		{
			Employee e2=employee.get(i);
			System.out.println("id is:"+e2.id+" Salary is:"+e2.salary);
			if(e2 instanceof Manager) {
					Manager manager=(Manager) e2;
					System.out.println("Domain:"+manager.domain);
					}
			
			}
			for(Employee emp1: employee)
			{
				System.out.println("id is:"+emp1.id+" Salary is"+emp1.salary);
				if(emp1 instanceof Manager) {
				Manager m1 =(Manager) emp1;
				System.out.println(m1.domain);
				
			}System.out.println("****************");
			//accessing Using Iterator
			Iterator<Employee> t= employee.iterator();
			while(t.hasNext()) {
			 Employee i=t.next();
			 System.out.println("ID:"+i.id+"Salary :"+i.salary);
			 if(i instanceof Manager)
			 {
				 Manager manager=(Manager) i;
				 System.out.println("Domainis :"+manager.domain);
			 }
			 System.out.println("***************");
			}
		}
	}

}
