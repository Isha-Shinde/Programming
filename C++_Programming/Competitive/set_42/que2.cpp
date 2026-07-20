/* write generic program to accept N values and count frequency of any specific value.

Input :    10 20 30 10 30 40 10 40 10  (value to check frequency : 10)
Output :  4
*/

#include <iostream>
using namespace std;

template <class T>
int Frequency(T *Arr,int Size, T No)
{
    int i = 0;
    int Count = 0;

    for(i = 0; i < Size; i++)
    {
        if(Arr[i] == No)
        {
            Count++;
        }
    }
    return Count;
}

int main()
{
    int Arr[] = {10,20,30,10,30,40,10,40,10};
    int iRet = Frequency(Arr,9,10);
    cout<<iRet<<"\n";

    return 0;
}