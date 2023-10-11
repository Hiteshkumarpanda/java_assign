package ASSGN2;
class Deposit
{
	long principal;
	int time;
	double rate;
	double total_amt;
	Deposit()
	{
		
	}
	Deposit(long principal, int time, double rate)
	{
	     this.principal=principal;
	     this.time=time;
	     this.rate=rate;
	}
	Deposit(long principal, int time)
	{
	    this.principal=principal;
	    this.time=time;
	}
	Deposit(long principal, double rate)
	{
		this.principal=principal;
		this.rate=rate;
	}
	void display()
	{
		System.out.println("principal: "+principal+"\t time: "+time+"\t rate: " +rate+"\t total amount: "+total_amt);
	}
	void calc_amt() 
	{
		total_amt = principal+(principal*rate*time)/100;
	}
	
}
public class A2Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	   Deposit d1 = new Deposit();
       d1.calc_amt();
       d1.display();
       Deposit d2 = new Deposit(1473, 4, 345.6);
       d2.calc_amt();
       d2.display();
       Deposit d3 = new Deposit(1426, 3);
       d3.calc_amt();
       d3.display();
       Deposit d4 = new Deposit(1528, 678.9);
       d4.calc_amt();
       d4.display();
       
	}

}
