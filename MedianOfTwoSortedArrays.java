class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] num3 = new int[100]; 
       for(int i=0;i<num1.length;i++){
           num3[i]=num1[i];
       }
        for(int i=0;i<num2.length;i++){
            
        for(int j=num1.length ;j<num2.length+num1.length;j++){
            num3[j]=num2[i];
        }
        }
        num3=num3.sort();
        if(num3.length%2!=0){
        int n=num3.length/2;
        System.out.println(num3[n]);
        }
        else{
            Sydtem.out.println(num3[n.floor]+num3[n.ceil]);
        }
    }

public static void main(String args[]){
    int[] num1 = new int[100]; 
    int[] num2 = new int[100];
    int n,m;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    for(int i=0;i<n;i++){
      num1[i]=sc.nextInt();  
    }
     for(int j=0;j<n;j++){
      num2[j]=sc.nextInt();  
    }
    double findMedianSortedArrays(int[] nums1, int[] nums2);
}
}
