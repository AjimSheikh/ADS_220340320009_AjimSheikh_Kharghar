import java.lang.*;
import java.util.*;

public class InsettionSort{
	static void insetionSort(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key = arr[i];
			int j=i-1;
			while (j>=0 && key<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		display(arr);
	}
	static void display(int a1[]){
		System.out.println();
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]);
		}
	}
	public static void main(String args[]){
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=ss.nextInt();
		int arr[]=new int[n];
	System.out.println("Enter Elements of Array");
		for(int i=0;i<n;i++){
			arr[i] = ss.nextInt();
		}
	System.out.println("Before Sort");
		display(arr);
		System.out.println('\n'+"After Sort");
		insetionSort(arr);
	}
}