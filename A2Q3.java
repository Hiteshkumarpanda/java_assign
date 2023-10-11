package ASSGN2;

import java.util.Scanner;

class Student
{
	int Roll;
	String Name;
	double DSA_Mark;
	void setdata(String n, int r, double dm) {
		Roll = r;
		Name = n;
		DSA_Mark = dm;
		
	}
	void showdata() {
		System.out.println(Name+"\t"+Roll+"\t"+DSA_Mark);
	}
}
public class A2Q3 {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Name\tRoll\tDSA_Mark");
        Student s[] = new Student[5];
        for(int i=0;i<5;i++) {
            s[i]=new Student();
        }
        s[0].setdata("hp", 48, 90);
        s[0].showdata();
        s[1].setdata("kp", 41, 91);
        s[1].showdata();
        s[2].setdata("gp", 42, 92);
        s[2].showdata();
        s[3].setdata("lp", 43, 93);
        s[3].showdata();
        s[4].setdata("mp", 44, 94);
        s[4].showdata();

        double max=s[0].DSA_Mark; 
        int maxindex=0;
        for(int i=1;i<5;i++) {
        	if(s[i].DSA_Mark>max) {
        		max=s[i].DSA_Mark;
        		maxindex=i;
        	}
        }
        System.out.println("Highest student mark details ");
        s[maxindex].showdata();
	}

}
