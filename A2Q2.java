package ASSGN2;

class omplex
{
  int real,imag;
    void setdata(int real,int imag) {
    	this.real=real;
    	this.imag=imag;
    }
    public Complex add(Complex c1,Complex c2) {
    	Complex c = new Complex();
    	c.real=c1.real+c2.real;
    	c.imag=c1.imag+c2.imag;
    	return c;
    }
    void display() {
    	System.out.println(real+" + i"+imag);
    }
}
public class A2Q2 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Complex c1 = new Complex();
        c1.setdata(3, 4);
        c1.display();
        Complex c2 = new Complex();
        c2.setdata(3, 4);
        c2.display();
        Complex sum = new Complex();
        sum = sum.add(c1, c2);
        sum.display();
		
		
	}

}
