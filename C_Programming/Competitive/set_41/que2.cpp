// write generic program to find largest number from three numbers.
#include <iostream>
using namespace std;

template <class T>
T Max(T no1, T no2, T no3)
{
    if(no1 > no2 && no1 > no3)
    {
        return no1;
    }
    else if(no2 > no1 && no2 > no3)
    {
        return no2;
    }
    else
    {
        return no3;
    }
}

int main()
{
    cout<<Max(21,11,51)<<"\n";
    cout<<Max(21.2f,11.5f,25.2f)<<"\n";
    cout<<Max(21.2,11.5,30.5)<<"\n";
    return 0;
}