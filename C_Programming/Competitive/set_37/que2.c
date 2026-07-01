/*
   write a program which accept one number from user and off that bit.return modified number.
*/

#include<stdio.h>

typedef unsigned int UINT;

int OffBit(UINT iNo,UINT iPos)
{
    UINT iMask = 0x00000001;
    UINT iResult = 0;

    iMask = iMask << (iPos - 1);
    iMask = ~iMask;

    iResult = iNo & iMask;

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

    iRet = OffBit(iValue,iLocation);

    printf("updated number is :%d\n",iRet);

    return 0;
    
}