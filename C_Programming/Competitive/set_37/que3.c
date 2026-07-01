/*
   write a program which accept one number from user and ON that bit.return modified number.
*/

#include<stdio.h>

typedef unsigned int UINT;

int OnBit(UINT iNo,UINT iPos)
{
    UINT iMask = 0x00000001;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);

    iResult = iNo | iMask;

    return iResult;
}


int main()
{
    UINT iValue = 0,iLocation = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%u",&iValue);

    printf("Enter Position :");
    scanf("%u",&iLocation);

    iRet = OnBit(iValue,iLocation);

    printf("updated number is :%d\n",iRet);

    return 0;
    
}