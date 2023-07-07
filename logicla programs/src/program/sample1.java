package program;

import java.util.ArrayList;

public class sample1 {
	
	public static void main7(String[] args) {
		char a='c';
		char b='h';
		String v=""+a+b;
		
		System.out.println(v);
	}
	
	
	public static void main2(String[] args) {
		String[]  a= {"shiva","sagar","ajay"};
		ArrayList b= new ArrayList();
		String s="";
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[i].length()-1;j>=0;j--) {
				char c=(a[i].charAt(j));
				s=s+c;
			}	
			b.add(s);
			s="";
		}
		System.out.println(b);
	}
	private static String valueOf(char k) {
		// TODO Auto-generated method stub
		return null;
	}



	public static void main3(String[] args) {
		int arr[]= {33,3,35,2,6,7,34,8};
			
		for(int j=1;j<=arr.length-1;j++)
			
		for(int i=0;i<arr.length-j;i++) {
			
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {33,3,5,2,635,7,34,8};
		
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0] = temp;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main10(String[] args) {
		int arr[]= {33,3,5,2,635,7,34,8};
		int temp= arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[7]=temp;
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	

	public static void main1(String[] args) {
		
		int arr[]= {33,3,5,2,635,7,34,8};
		int a=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(a<=arr[i]) {
				a=arr[i];
			}
			
		}
	System.out.println(a);
	}
	
	
}
