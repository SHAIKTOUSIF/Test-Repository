package com.array3;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp=new Employee[5];
		emp[0]=new Employee(1,"Sherkhan",5);
		emp[1]=new Employee(2,"Bhagira",4);
		emp[2]=new Employee(3,"Mowgly",3);
		emp[3]=new Employee(1,"Bhalu",6);
		emp[4]=new Employee(1,"Moti",2);
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Employee Id:"+emp[i].id+"\nEmployee Name:"+emp[i].name+"\nEmployee Salary:"+emp[0].salary);
			System.out.println("++++++++++++");
		}
		
		
				
	}

}
