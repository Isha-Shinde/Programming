#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize;
        
        //parameterised constructor
        ArrayX(int X)
        {
            cout<<"inside constructor\n";
            iSize = X;               //characteristics initialization
            Arr = new int[iSize];   //resourece allocation
        }
        
        //Destructor
        ~ArrayX()
        {
            cout<<"inside destructor\n";
            delete []Arr;           //resource deallocation
        }
};

int main()
{    //static memory alloaction for object
    //ArrayX aobj1(5);     

    //dynamic memory allocation for object
    ArrayX *aobj1 = new ArrayX(5);
    return 0;

}
    
