/*
   write a program which accept one number from user and ON its first 4 bits.return modified number.
*/

#include<stdio.h>

typedef unsigned int UINT;

int ONBit(UINT iNo)
{
    UINT iMask = 0x0000000F;
    UINT iResult = 0;

    iResult = iNo | iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%u",&iValue);

    iRet = ONBit(iValue);

    printf("updated number is : %d\n",iRet);

    return 0;
    
}