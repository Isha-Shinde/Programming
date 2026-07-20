// write generic program to Accept N values from user and return smallest values.
#include <iostream>
using namespace std;

template <class T>
T Min(T *Arr, int Size)
{
    int i = 0;
    T Min = Arr[0];

    for(i = 0; i < Size; i++)
    {
        if(Arr[i] < Min)
        {
            Min = Arr[i];
        }
    }
    return Min;
}

int main()
{
    int Arr[] = {10,20,30,40,50};
    float Brr[] = {10.0,3.7,9.8,8.7};

    int iRet = Min(Arr,5);
    cout<<iRet<<"\n";

    float fRet = Min(Brr,4);
    cout<<fRet<<"\n";

    return 0;
}