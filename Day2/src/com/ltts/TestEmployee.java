package com.ltts;

public class TestEmployee {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setAge(15); // setter to assign values
	e.setName("Nezuko");
	e.setSalary(50000);
System.out.println(e.getAge()+" "+e.getName()+" "+e.getSalary()); // getter to procure the values
}
}
