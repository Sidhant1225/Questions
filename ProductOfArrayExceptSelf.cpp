#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
 int a[n];
 for(int i=0;i<n;i++){
     cin>>a[i];
 }
 for(int i=0;i<n;i++){
     int m=1;
 for(int j=0;j<n;j++){
     if(a[i]==a[j]){
         continue;
     }
     else{
         m=m*a[j];
     }
 }
 cout<<m<<" ";
 }

    return 0;
}
