public class Main
{
	public int maxArea(int[] height) {
	    int maxarea;
        for(int i=0;i<height.length;i++){
            for(j=i+1;j<height.length;j++){
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxarea;
    }
	public static void main(String[] args) {
	  
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    Main m=new Main();
	    int a=m.maxArea(int[] arr);
	    System.out.println(a);
	
	}
}
