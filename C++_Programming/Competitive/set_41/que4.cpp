// write generic program to Accept N values from user and return largest values.

#include <iostream>
using namespace std;

template <class T>
T Max(T *Arr, int Size)
{
    int i = 0;
    T Max = Arr[0];

    for(i = 0; i < Size; i++)
    {
        if(Arr[i] > Max)
        {
            Max = Arr[i];
        }
    }
    return Max;
}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0,3.7,9.8,8.7};

    int iRet = Max(Arr,5);
    cout<<iRet<<"\n";

    float fRet = Max(Brr,4);
    cout<<fRet<<"\n";

    return 0;
}