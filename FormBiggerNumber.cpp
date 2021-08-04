#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,m,max=0,u;
    cin>>n;
    int a[n],b[100];
    
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<n;i++){
        while(a[i]!=0){
            u=a[i]%10;
            a[i]=a[i]/10;
        }
            if(u>max){
                u=max;
                m=i;
            
        }
        b[0]=a[m];
        sort(a,a+n);
        for(int j=n;j>=0;j++){
            for(int i=1;i<n;i++){
                if(a[j]==a[m]){
                    continue;
                }
                b[i]=a[j];
            }
        }
        
        for(int i=0;i<n;i++){
            cout<<b[i];
        }
    

    return 0;
    }
}
