package week1.day2;
public class TwoWheeler
{
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 2135132;
	boolean isPunctured = true;
	String bikeName = "Hero Xpulse 200";
	double runningKM = 32000.22354335133;  // for float= 6 decimal digits, for double = 15 decimal digits
	
	public static void main(String[] args) {
		TwoWheeler tw = new TwoWheeler();//class object creation
		
		System.out.println("No of Wheels= "+tw.noOfWheels);
		System.out.println("No of Mirrors= "+tw.noOfMirrors);
		System.out.println("Chassis Number= "+tw.chassisNumber);
		System.out.println("Bike is Punctured= "+tw.isPunctured);
		System.out.println("Bike Name= "+tw.bikeName);
		System.out.println("Running KM= "+tw.runningKM+" KM");
		
	
	}
}

/*public class TwoWheeler {
	public void noOfWheels (int a) {
		System.out.println("No of Wheels= "+a);
	}
public void noOfMirrors (short b) {
	System.out.println("No of Mirrors= "+b);
}
public void chasisNumber (long c) {
	System.out.println("Chasis number is= "+c);
}
public void bikeName(String d) {
System.out.println("Bike name is= "+d);
}
public void runningKM (double e) {
	System.out.println("Running KM is= "+e);
}
public static void main(String[] args) {
	TwoWheeler tw= new TwoWheeler();
	tw.noOfWheels(2);
	tw.noOfMirrors((short) 2);
	tw.chasisNumber(215421215);
	tw.bikeName("Hero Xpulse 200");
	tw.runningKM(2200);
}
}
*/