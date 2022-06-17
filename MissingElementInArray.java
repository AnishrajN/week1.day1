package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8}; 
		int l = arr.length;
		Arrays.sort(arr);
		
		for (int i = arr[0]; i < l; i++)
		{
			if (i!=arr[i-1])
			{
				System.out.println("Missing Element is = "+i);
				break;
			}
		}
	}
	}
	
		/* for (int i = 0; i < l-1; i++)
		{
			//System.out.println(arr[i]+" "+arr[i+1]);
			if((arr[i]-arr[i+1])!=-1)                                  ////   1-2==-1; 2-3==-1; 3-4==-1;  4-6==-2                   
			//	System.out.println((arr[i]+1)+" "+(i+2)); 
		}*/
