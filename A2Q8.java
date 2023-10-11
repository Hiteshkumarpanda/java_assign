package ASSGN2;
interface DetailInfo
{
	void display();
	int count();
}
class Persons
{
	static int maxcount;
	String name;
	Persons(String name)
	{
		this.name=name;
		System.out.println(this);
	}
	void display()
	{
		System.out.println("Name: "+name);
	}
	int count()
	{
		return name.length();
	}
}
public class A2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Persons p1=new Persons("hitesh");
        p1.display();
        int c1 = p1.count();
        System.out.println("no. of characters in name is: "+c1);
        Persons p2=new Persons("ram");
        p2.display();
        int c2 = p2.count();
        System.out.println("no. of characters in name is: "+c2);
	}

}
