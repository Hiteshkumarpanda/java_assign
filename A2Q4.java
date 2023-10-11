package ASSGN2;
class Product
{
	int pid;
	double price; 
	
	  Product(int pid, double price)
	 {
		 this.pid=pid;
		 this.price=price;
	 }
	 void display() 
	 {
		System.out.println(pid+"\t"+"\t"+price); 
	 }
}
public class A2Q4 {
	static double tot_price ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Product-id\tproduct-price");
       Product p1 = new Product(4321, 30);
       p1.display();
       Product p2 = new Product(4322, 40);
       p2.display();
       Product p3 = new Product(4323, 50);
       p3.display();
       Product p4 = new Product(4324, 60);
       p4.display();
       Product p5 = new Product(4325, 70);
       p5.display();
       tot_price = p1.price+p2.price+p3.price+p4.price+p5.price ;
       System.out.println("The person have to pay total amount of Rs."+tot_price);
       
	}

}
