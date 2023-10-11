package ASSGN2;
class Students
{
	String name;
	int roll;
	String course;
	void input_Student(String n, int r, String c)
	{
		name = n;
		roll=r;
		course=c;
	}
	void display_Student()
	{
		System.out.print("Name: "+name+"\t Roll_number: "+roll+"\tCourse: "+course );
	}
	
}
class Exam extends Students
{
	double mark1,mark2,mark3;
	void input_Marks(double m1, double m2, double m3)
	{
		
		mark1=m1; 
		mark2=m2;
		mark3=m3;
	}
	void display_Result()
	{
		System.out.println("\tMark1: "+mark1+"\t Mark2: "+mark2+"\t Mark3: "+mark3);
	}
}
public class A2Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Exam e[] = new Exam[5];
        for(int i=0;i<5;i++)
        {
        	e[i]=new Exam();
        }
        e[0].input_Student("Hitesh", 48, "B.tech");
        e[0].input_Marks(100, 100, 100);
        e[1].input_Student("Ram", 49, "B.tech");
        e[1].input_Marks(98, 100, 96);
        e[2].input_Student("Sita", 50, "BSc");
        e[2].input_Marks(98, 94, 96);
        e[3].input_Student("Hari", 51, "B.Pharm");
        e[3].input_Marks(96, 98, 94);
        e[4].input_Student("jaddu", 52, "MBBS");
        e[4].input_Marks(95, 93, 98);
        for(int i=0;i<5;i++)
        {
        	e[i].display_Student();
        	e[i].display_Result();
        }
	}

}
