#include<iostream>
#include<stdio.h>
using namespace std;

void patten1(int n)
{
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j< n; j++)
        {
            cout<<"* ";
        }
        cout<<endl;
    }
    
}

int main()
{
    
    // cout<<"hello"<<endl;
    patten1(5);
    // cout<<"hello";
    return 0;
}

