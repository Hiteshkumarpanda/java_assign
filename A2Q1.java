package ASSGN2;

class Phone{
	
	int area_code4, exchange4, number4,area_code5, exchange5, number5;
	void input(int area_code1,int exchange1,int number1,int area_code2,int exchange2,int number2){
		area_code4=area_code1;    
		exchange4=exchange1;
		number4=number1;
		area_code5=area_code2;    
		exchange5=exchange2;
		number5=number2;
	}
	void display() {
		
		System.out.println("Mynumber is ("+area_code4+") "+exchange4+"-"+number4);
		System.out.println("Yournumber is ("+area_code5+") "+exchange5+"-"+number5);
	}
}
public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area_code1 = Integer.parseInt(args[0]);
		int exchange1 = Integer.parseInt(args[1]);
		int number1 = Integer.parseInt(args[2]);
		int area_code2 = Integer.parseInt(args[3]);
		int exchange2 = Integer.parseInt(args[4]);
		int number2 = Integer.parseInt(args[5]);
		Phone ph1 = new Phone();
		ph1.input(area_code1, exchange1, number1,area_code2, exchange2, number2);
		ph1.display();
//		Phone ph2 = new Phone(); 
//		ph2.input(area_code2, exchange2, number2);
//		ph2.display();

	}
}
