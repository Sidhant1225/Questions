import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] a = new int[20];
		int n,k=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int[] b=new int[20];
		for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
		     if(a[i]!=b[j]){
		          b[k]=a[i];
		         k++;
		     }
		    
		 }
		    
		}
		for(int i=0;i<n;i++){
		    System.out.print(b[i]+" ");
		}
	}
}
