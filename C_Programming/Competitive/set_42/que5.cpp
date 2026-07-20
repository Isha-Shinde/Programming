/* write generic program to Accept N values and reverse the contents.

Input :    10 20 30 10 30 40 10 40 10  
Output :   10 40 10 40 30 10 30 20 10

*/

#include <iostream>
using namespace std;

template <class T>
void Reverse(T *Arr,int Size)
{
    int Start = 0;
    int End = Size - 1;

    T Temp;

    while(Start < End)
    {
        Temp = Arr[Start];
        Arr[Start] = Arr[End];
        Arr[End] = Temp;

        Start++;
        End--;
    }
}

int main()
{
    int Arr[] = {10,20,30,10,30,40,10,40,10};

    for(int i = 0; i < 9; i++)
    {
        cout<<Arr[i]<<"\n";
    }

    Reverse(Arr,9);

    cout<<"\n";
    for(int i = 0; i < 9; i++)
    {
        cout << Arr[i]<<"\n";
    }

    return 0;
}
