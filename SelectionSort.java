import java.util.*;
public class SelectionSort{
	public static void main(String[] arhs){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		selection(a,n);
	}
	public static void selection(int a[],int n){
		
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(a[j]<a[min])
					min=j;
			}
			a[i]=a[i]+a[min];
			a[min]=a[i]-a[min];
			a[i]=a[i]-a[min];
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}