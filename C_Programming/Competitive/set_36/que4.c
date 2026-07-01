/*
   write a program which accept one number from user and toggle 7th and 10th bit of that number. return modified number.
*/

#include<stdio.h>

typedef unsigned int UINT;

int ToggleBit(UINT iNo)
{
    UINT iMask = 0x00000240;
    UINT iResult = 0;

    iResult = iNo ^ iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0;
    int iRet = 0;

    printf("Enter number :");
    scanf("%u",&iValue);

    iRet = ToggleBit(iValue);

    printf("updated number is : %d\n",iRet);

    return 0;
    
}