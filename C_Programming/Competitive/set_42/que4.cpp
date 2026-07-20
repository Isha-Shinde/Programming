/* write generic program to Accept N values search last occurance of any specific value.

Input :    10 20 30 10 30 40 10 40 10  (value to search : 40)
Output :  8

*/

#include <iostream>
using namespace std;

template <class T>
int SerchLast(T *Arr,int Size, T No)
{
    int i = 0;

    
    for(i = Size - 1; i >= 0; i--)
    {
        if(Arr[i] == No)
        {
            return(i + 1);
        }
    }
    return -1;
}

int main()
{
    int Arr[] = {10,20,30,10,30,40,10,40,10};
    int iRet = SerchLast(Arr,9,40);
    cout<<iRet<<"\n";

    return 0;
}