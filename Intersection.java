package week1.day2;

public class Intersection {
   
	
	public static void main(String[] args) {
		int[] a= {2,5,6,8,9,4,3,1,7,11};
		int[] b= {3,4,5,15,13,11};

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if(a[i]==b[j]) 
				System.out.println(a[i]);
			}
		}
	}
}

/*
 * O.L--- i=0, 0<10-true
 * I.L --- j=0,j<6--true
 * if(2==3)false-
 * j++==j=1,1<6-- true
 * if(2==4)false
 * 
 * 
 * 
 * */
 