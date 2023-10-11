package ASSGN2;
class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("inside constructor person: ");
	}
}
class Employee extends Person
{
	int eid;
	double salary;
	
	Employee(String name, int age, int eid, double salary)
	{
		super(name, age);
		this.eid=eid;
		this.salary=salary;
		System.out.println("inside constructor employee: ");
	}
	void display() 
	{
		System.out.println("Name: "+name+"\t Age: "+"\t EmployeeID: "+eid+"\t Salary: "+salary);
	}
}

public class A2Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee p1 = new Employee("Hitesh", 19, 224101, 4000000);
         p1.display();
         Employee p2 = new Employee("Hitesh", 19, 224101, 4000000);
         p2.display();
         Employee p3 = new Employee("Hitesh", 19, 224101, 4000000);
         p3.display();
         
         
	}

}
