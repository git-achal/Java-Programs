package basic;

import java.util.Arrays;

public class Array2ndHighest2ndLowest {
	public static void secondHighest(int arr[]) {
		int j=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(j<arr[i]) {
				k=j;
				j=arr[i];
			}
		}
		System.out.println(k);
		
	}
	public static void secondLowest(int arr[]) {
		int a=1;
		int b=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(a<arr[i] && arr[i]>b) {
				b=a;
				a=arr[i];
			}else {
				b=a;
				a=arr[i];
			}
		}
		
		System.out.println(b);
	}
	public static void main(String[] args) {
	  int arr[] = {1,5,4,11,13};
	  secondLowest(arr);
	  secondHighest(arr);
	}
}
