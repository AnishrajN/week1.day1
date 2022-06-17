package week1.day2;

public class Car {
	public void applyBreak(boolean a) {
		System.out.println(a);

	}
	public void applyGear(int a) {
		System.out.println(a);
         
	}
	public void switchOnAc(String a) {
	    System.out.println(a);

	}
	public void applyAccelerator(String b) {
	    System.out.println(b);

	}
	public static void main(String[] args) {
		Car c =new Car();
		c.applyBreak(true);
		c.applyGear(2);
		c.switchOnAc("On");
		c.applyAccelerator("yes");
	}
	


}
