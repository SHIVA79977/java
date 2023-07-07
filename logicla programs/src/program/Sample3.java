package program;

public class Sample3 {
public static void main(String[] args) {
	
	int arr[] ={23,24,3,6,4,78,56,9,38};
	for(int i=0;i<arr.length;i++) {
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=arr[2];
		arr[2]=arr[3];
		arr[3]=arr[4];
		arr[4]=arr[5];
		arr[5]=arr[6];
		arr[6]=arr[7];
		arr[7]=arr[8];
		arr[8]=temp;
		System.out.print(arr[i]+" ");
	}
	
	
}
}
