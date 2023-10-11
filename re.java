package ASSGN2;
import java.util.*;
class Complex
{
	double real,imag;
	void setdata(double real2 , double imag2) {
		real = real2;
		imag = imag2;
	}
	void display() {
		System.out.println(real+(imag<0?" - ":" + ")+Math.abs(imag)+"i");
	}
	public Complex add(Complex c1,Complex c2) {
		Complex c = new Complex(); 
		c.real=c1.real+c2.real;
		c.imag=c1.imag+c2.imag;
		return c;
	}
}
public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         
         
         Complex c1 = new Complex();
         System.out.println("Enter the data for 1st complex number ");
         double real1 = sc.nextDouble();
         double imag1 = sc.nextDouble();
         c1.setdata(real1, imag1);
         Complex c2 = new Complex();
         System.out.println("Enter the data for 2nd complex number ");
         double real2 = sc.nextDouble();
         double imag2 = sc.nextDouble();
         c2.setdata(real2, imag2);
         System.out.println("The 1st Complex number is ");
         c1.display();
         System.out.println("The 2nd Complex number is ");
         c2.display();
         System.out.println("sum of the two complex number is: ");
         Complex c3 = new Complex();
         c3 = c3.add(c1, c2);
         c3.display();
         
	}

}
