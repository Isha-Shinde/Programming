/*
   write a program which accept one number and count number of ON(1) bits in it without using % and / operator.
   
   input : 11     output : 3

*/

#include<stdio.h>
typedef unsigned int UINT;

int CountOne(UINT iNo)
{
    UINT iCount = 0;
    UINT iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo & 1;
        iCount = iCount + iDigit;
        iNo = iNo >> 1;
    }

    return iCount;
}


int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number :");
    scanf("%u",&iValue);

    iRet = CountOne(iValue);

    printf("Number of 1's are :%d\n",iRet);
    return 0;
    
}