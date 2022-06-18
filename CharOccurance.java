package week1.day2;

public class CharOccurance {
 public static void main(String[] args) {
	// to check no of occurrences of char e
	  String str = "Welcome to chennai";
	  int count = 0;
	  int l=str.length();
	  char[] a= new char[l]; //Declaration of char array to the string length
	 char want = 'e' ;
	 for (int i = 0; i <l; i++) {
		 a[i]=str.charAt(i); //storing string characters in char array
		
	}
	 
	 for (int i = 0; i <l; i++) {
		 if (a[i]==want) {
			 count++;
					}
		 
	}
	 System.out.println(count);
	 
		
	}
}

