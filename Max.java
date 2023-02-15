package Num;
import java.util.Scanner;
public class Max 
{
	static void a(int arr[])
	{
		int max=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]>max)
		{
		max=arr[j];	
		}
	}
 System.out.println(max);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		a(arr);
	}
}